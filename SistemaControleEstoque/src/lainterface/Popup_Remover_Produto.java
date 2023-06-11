package lainterface;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import estoque.Estoque;

public class Popup_Remover_Produto {
    
    public JFrame frame; //OK

    public JLabel textoRemoverProduto; //OK
    public JLabel textoQuantidade; //OK

    public JTextField inputQuantidadeRemover; //OK

    public JButton botaoRemover; //OK
    public JButton botaoRemoverTudo; //OK
    public JButton botaoCancelar; //OK

    public Popup_Remover_Produto(String nomeEstoque, JframePrincipal frameprincipal, Popup_Botoes_Predio_interface popup, Estoque estoque, int predio, int lado, int nivel){

        //ADICIONANDO JFRAME  
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(280, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame = frame;

        //ADICIONANDO A JLABEL TEXTO REMOVER PRODUTO
        JLabel label1 = new JLabel();
        label1.setBackground(Color.BLUE);
        //label1.setOpaque(true);
        Font fonte1 = new Font("Remover Produto", Font.BOLD, 20);
        label1.setFont(fonte1);
        label1.setText(fonte1.getName());
        label1.setBounds(50, 0, 180, 30);
        this.textoRemoverProduto = label1;

        //ADICIONANDO A JLABEL TEXTO QUANTIDADE
        JLabel label2 = new JLabel();
        label2.setBackground(Color.RED);
        //label2.setOpaque(true);
        Font fonte2 = new Font("Quantidade:", Font.BOLD, 15);
        label2.setFont(fonte2);
        label2.setText(fonte2.getName());
        label2.setBounds(20, 50, 90, 30);
        this.textoQuantidade = label2;

        //ADICIONANDO O INPUT DO QUANTIDADE PARA REMOVER
        JTextField textfield1 = new JTextField();
        textfield1.setBounds(120, 50, 110, 30);  
        this.inputQuantidadeRemover = textfield1;

        //ADICIONANDO O BOTÃO REMOVER
        JButton botao1 = new JButton();
        botao1.addActionListener(e -> remover(nomeEstoque, frameprincipal, popup, estoque, predio, lado, nivel));
        botao1.setFocusable(false);
        Font fontebotao1 = new Font("Remover", Font.BOLD, 13);
        botao1.setFont(fontebotao1);
        botao1.setText(fontebotao1.getName());
        botao1.setBounds(20, 110, 130, 30);
        this.botaoRemover = botao1;

        //ADICIONANDO O BOTÃO REMOVER TUDO
        JButton botao2 = new JButton();
        botao2.addActionListener(e -> this.removerTudo(nomeEstoque, frameprincipal, popup, estoque, predio, lado, nivel));
        botao2.setFocusable(false);
        Font fontebotao2 = new Font("Remover Tudo", Font.BOLD, 13);
        botao2.setFont(fontebotao2);
        botao2.setText(fontebotao2.getName());
        botao2.setBounds(20, 145, 130, 30);
        this.botaoRemoverTudo = botao2;

        //ADICIONANDO O BOTÃO CANCELAR
        JButton botao3 = new JButton();
        botao3.addActionListener(e -> this.frame.dispose());
        botao3.setFocusable(false);
        Font fontebotao3 = new Font("Cancelar", Font.BOLD, 13);
        botao3.setFont(fontebotao3);
        botao3.setText(fontebotao3.getName());
        botao3.setBounds(20, 200, 130, 30);
        this.botaoCancelar = botao3;

        //ADICIONANDO JLABELS
        this.frame.add(this.textoRemoverProduto);
        this.frame.add(this.textoQuantidade);

        //ADICIONANDO JTEXTFIELDS
        this.frame.add(this.inputQuantidadeRemover);

        //ADICIONANDO JBUTTONS
        this.frame.add(this.botaoRemover);
        this.frame.add(this.botaoRemoverTudo);
        this.frame.add(this.botaoCancelar);

        this.frame.setVisible(true);
    }

    public void remover(String nomeEstoque, JframePrincipal frameprincipal, Popup_Botoes_Predio_interface popup, Estoque estoque, int predio, int lado, int nivel){
        
        if(this.inputQuantidadeRemover.getText().matches("\\d+")){ //VERIFICANDO SE OS INPUTS ESTÃO CORRETOS
            int qtd = Integer.parseInt(this.inputQuantidadeRemover.getText()); //PEGANDO A QUANTIDADE A SER REMOVIDA
            int codigo = estoque.pegarCodigoProduto(predio, lado, nivel); //PEGANDO O CÓDIGO DO PRODUTO QUE DESEJA SER REMOVIDO
            int dia = estoque.pegarDiaValidade(predio, lado, nivel); //PEGANDO A DATA DO PRODUTO QUE DESEJA SER REMOVIDO
            int mes = estoque.pegarMesValidade(predio, lado, nivel);
            int ano = estoque.pegarAnoValidade(predio, lado, nivel);
            int quantidadearquivo = estoque.pegarQuantidade(predio, lado, nivel); //A QUANTIDADE PRESENTE NO ARQUIVO
            int novaquantidade = estoque.pegarQuantidade(predio, lado, nivel) - qtd; //A QUANTIDADE QUE PRECISA SER ESCRITA NO ARQUIVO
            if((quantidadearquivo - qtd) >= 0){// VERIFICANDO SE ESTÁ TENTANDO MOVER UMA QUANTIDADE SUPERIOR A EXISTE NO ESPAÇO DE PARTIDA
                
                estoque.remover(predio, lado, nivel, qtd); //OPERAÇÃO DE REMOVER DO BACK-END

                //REMOVENDO NO ARQUIVO
                //PEGANDO O PATH DO ARQUIVO QUE ARMAZENA OS PRODUTOS
                String pathProdutos = "SistemaControleEstoque/src/arquivosEstoque/"+nomeEstoque+"/"+nomeEstoque+"ProdutosEstoque"+"/"+nomeEstoque+"ProdutosEstoque.csv";
            
                File file = new File(pathProdutos); //ACESSANDO O ARQUIVO
                BufferedReader reader = null;
                String linha = "";

                ArrayList<String> array = new ArrayList<>();//ARRAY QUE IRÁ MANTER AS LINHAS DO ARQUIVO LIDO

                //PEGANDO UM ARQUIVO IGUAL
                try {
                    reader = new BufferedReader(new FileReader(file));
                    linha = reader.readLine();//PARA PULAR A PRIMEIRA LINHA
                    while((linha = reader.readLine()) != null){ //LAÇO PARA FICAR LENDO AS LINHAS DO ARQUIVO
                        //System.out.println("ENTROU LOOP");
                        String[] coluna = linha.split(";");// SEPARAR PELO ;
                        if(linha != ""){//VERIFICANDO SE A LINHA NÃO ESTÁ VAZIA POR ALGUMA RAZÃO
                            //VERIFICANDO SE A LINHA A SER ANALISADA É A LINHA QUE DESEJAMOS REMOVER A QUANTIDADE A SER MOVIDA
                            if((Integer.parseInt(coluna[0]) == predio )&& Integer.parseInt(coluna[1])==lado && Integer.parseInt(coluna[2])==nivel && Integer.parseInt(coluna[3])==codigo && Integer.parseInt(coluna[4])==dia && Integer.parseInt(coluna[5])==mes &&Integer.parseInt(coluna[6])==ano && Integer.parseInt(coluna[7])==quantidadearquivo){
                                if(novaquantidade > 0){//VERIFICANDO SE A NOVA QUANTIDADE É POSITIVA, SE FOR NEGATIVA ENTÃO NÃO PRECISAMOS SALVÁ-LA NO ARQUIVO.
                                    //ADICIONANDO A LINHA COM A NOVA QUANTIDADE
                                    String a =(""+coluna[0]+";"+coluna[1]+";"+coluna[2]+";"+coluna[3]+";"+coluna[4]+";"+coluna[5]+";"+coluna[6]+";"+novaquantidade+"");
                                    array.add(a); 
                                }
                            }else{
                                array.add(linha);
                            }
                        }
                    }
                    reader.close();

                    //ESCREVENDO AS LINHAS LIDAS NO NOVO ARQUIVO 
                    BufferedWriter bw;
                    bw = new BufferedWriter(new FileWriter(file, true));
                    bw.close(); 
                    
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(file));
                    bw2.write("predio;lado;nivel;codigo;dia;mes;ano;quantidade");
                    for (String elemento : array) {
                        bw2.write("\n"+elemento);
                    }
                    bw2.newLine();
                    bw2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                this.frame.dispose();//FECHANDO A JANELA POP-UP
                frameprincipal.atualizarOsBotoes(estoque);//ATUALIZANDO OS BOTÕES QUE SERÃO IMPRESSOS NA JFRAME PRINCIPAL
                popup.atualizarInformacoes(estoque, predio, lado, nivel);//ATUALIZANDO AS INFORMAÇÕES DO POP-UP
                popup.atualizarPermissaoBotoes(estoque, predio, lado, nivel);
            }else JOptionPane.showMessageDialog(null, "Erro: A quantidade para ser removida superior a existente!", null, JOptionPane.ERROR_MESSAGE);
            
            
        }else JOptionPane.showMessageDialog(null, "Valores Inválidos!", null, JOptionPane.ERROR_MESSAGE);
        
        
    }

    public void removerTudo(String nomeEstoque, JframePrincipal frameprincipal, Popup_Botoes_Predio_interface popup, Estoque estoque, int predio, int lado, int nivel){
        int codigo = estoque.pegarCodigoProduto(predio, lado, nivel);
        int dia = estoque.pegarDiaValidade(predio, lado, nivel);
        int mes = estoque.pegarMesValidade(predio, lado, nivel);
        int ano = estoque.pegarAnoValidade(predio, lado, nivel);
        
        estoque.removerTudo(predio, lado, nivel);


        String pathProdutos = "SistemaControleEstoque/src/arquivosEstoque/"+nomeEstoque+"/"+nomeEstoque+"ProdutosEstoque"+"/"+nomeEstoque+"ProdutosEstoque.csv";
        
        File file = new File(pathProdutos);
        BufferedReader reader = null;
        String linha = "";

        ArrayList<String> array = new ArrayList<>();

        //PEGANDO UM ARQUIVO IGUAL
        try {
            reader = new BufferedReader(new FileReader(file));
            linha = reader.readLine();//PARA PULAR A PRIMEIRA LINHA
            while((linha = reader.readLine()) != null){
                System.out.println("ENTROU LOOP");
                String[] coluna = linha.split(";");
                if(linha != ""){
                    if((Integer.parseInt(coluna[0]) == predio )&& Integer.parseInt(coluna[1])==lado && Integer.parseInt(coluna[2])==nivel && Integer.parseInt(coluna[3])==codigo && Integer.parseInt(coluna[4])==dia && Integer.parseInt(coluna[5])==mes &&Integer.parseInt(coluna[6])==ano){
                    
                    }else{
                        array.add(linha);
                    }
                }
            }
            reader.close();

            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.close(); 
            
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(file));
            bw2.write("predio;lado;nivel;codigo;dia;mes;ano;quantidade");
            for (String elemento : array) {
                bw2.write("\n"+elemento);
            }
            bw2.newLine();
            bw2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.frame.dispose();
        frameprincipal.atualizarOsBotoes(estoque);
        popup.atualizarInformacoes(estoque, predio, lado, nivel);
        popup.atualizarPermissaoBotoes(estoque, predio, lado, nivel);
    }
}
