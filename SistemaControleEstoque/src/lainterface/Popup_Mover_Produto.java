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
import estoque.Produto;

public class Popup_Mover_Produto {
    
    private JFrame frame;

    private JLabel textoMoverProduto;
    private JLabel textoPredioDestino;
    private JLabel textoLadoDestino;
    private JLabel textoNivelDestino;
    private JLabel textoQuantidade;

    private JTextField inputPredioDestino;
    private JTextField inputLadoDestino;
    private JTextField inputNivelDestino;
    private JTextField inputQuantidade;

    private JButton botaoMover;
    private JButton botaoCancelar;

    public Popup_Mover_Produto(String nomeEstoque, JframePrincipal frameprincipal, Popup_Botoes_Predio_interface pop ,Estoque estoque, int predio, int lado, int nivel){
        //ADICIONANDO O JFRAME
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(280, 370);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame = frame;

        //ADICIONANDO O TEXTO MOVER PRODUTO
        JLabel label1 = new JLabel();
        label1.setBackground(Color.BLUE);
        //label1.setOpaque(true);
        Font fonte1 = new Font("Mover Produto", Font.BOLD, 20);
        label1.setFont(fonte1);
        label1.setText(fonte1.getName());
        label1.setBounds(50, 0, 150, 30);
        this.textoMoverProduto = label1;

        //ADICIONANDO O TEXTO PRÉDIO DESTINO
        JLabel label2 = new JLabel();
        label2.setBackground(Color.RED);
        //label2.setOpaque(true);
        Font fonte2 = new Font("Prédio Destino:", Font.BOLD, 15);
        label2.setFont(fonte2);
        label2.setText(fonte2.getName());
        label2.setBounds(20, 50, 110, 30);
        this.textoPredioDestino = label2;

        //ADICIONANDO O JTEXTFIELD INPUT PRÉDIO DESTINO
        JTextField textfield1 = new JTextField();
        textfield1.setBounds(140, 50, 90, 30);  
        this.inputPredioDestino = textfield1;

        //ADICIONANDO O TEXTO LADO DESTINO
        JLabel label3 = new JLabel();
        label3.setBackground(Color.GREEN);
        //label3.setOpaque(true);
        Font fonte3 = new Font("Lado Destino:", Font.BOLD, 15);
        label3.setFont(fonte3);
        label3.setText(fonte3.getName());
        label3.setBounds(20, 90, 100, 30);
        this.textoLadoDestino = label3;

        //ADICIONANDO O JTEXTFIELD INPUT LADO DESTINO
        JTextField textfield2 = new JTextField();
        textfield2.setBounds(140, 90, 90, 30);  
        this.inputLadoDestino = textfield2;

        //ADICIONANDO O TEXTO NÍVEL DESTINO
        JLabel label4 = new JLabel();
        label4.setBackground(Color.YELLOW);
        //label4.setOpaque(true);
        Font fonte4 = new Font("Nível Destino:", Font.BOLD, 15);
        label4.setFont(fonte4);
        label4.setText(fonte4.getName());
        label4.setBounds(20, 130, 100, 30);
        this.textoNivelDestino = label4;

        //ADICIONANDO O JTEXTFIELD INPUT NÍVEL DESTINO
        JTextField textfield3 = new JTextField();
        textfield3.setBounds(140, 130, 90, 30);  
        this.inputNivelDestino = textfield3;

        //ADICIONANDO O TEXTO QUANTIDADE PARA MOVER
        JLabel label5 = new JLabel();
        label5.setBackground(Color.GRAY);
        //label5.setOpaque(true);
        Font fonte5 = new Font("Quantidade:", Font.BOLD, 15);
        label5.setFont(fonte5);
        label5.setText(fonte5.getName());
        label5.setBounds(20, 170, 90, 30);
        this.textoQuantidade = label5;

        //ADICIONANDO O JTEXTFIELD INPUT QUANTIDADE
        JTextField textfield4 = new JTextField();
        textfield4.setBounds(140, 170, 90, 30);  
        this.inputQuantidade = textfield4;

        //ADICIONANDO O JBUTTON MOVER
        JButton botao1 = new JButton();
        botao1.addActionListener(e -> this.mover(nomeEstoque, frameprincipal , pop, estoque, predio, lado, nivel));
        botao1.setFocusable(false);
        Font fontebotao1 = new Font("Mover", Font.BOLD, 13);
        botao1.setFont(fontebotao1);
        botao1.setText(fontebotao1.getName());
        botao1.setBounds(20, 220, 110, 30);
        this.botaoMover = botao1;

        //ADICIONANDO O JBUTTON CANCELAR
        JButton botao2 = new JButton();
        botao2.addActionListener(e -> this.frame.dispose());
        botao2.setFocusable(false);
        Font fontebotao2 = new Font("Cancelar", Font.BOLD, 13);
        botao2.setFont(fontebotao2);
        botao2.setText(fontebotao2.getName());
        botao2.setBounds(20, 280, 110, 30);
        this.botaoCancelar = botao2;

        //ADICIONANDO OS JLABELS
        this.frame.add(this.textoMoverProduto);
        this.frame.add(this.textoPredioDestino);
        this.frame.add(this.textoLadoDestino);
        this.frame.add(this.textoNivelDestino);
        this.frame.add(this.textoQuantidade);

        //ADICIONANDO OS JTEXTFIELDS
        this.frame.add(this.inputPredioDestino);
        this.frame.add(this.inputLadoDestino);
        this.frame.add(this.inputNivelDestino);
        this.frame.add(this.inputQuantidade);

        //ADICIONANDO OS JBUTTONS
        this.frame.add(this.botaoMover);
        this.frame.add(this.botaoCancelar);
        

        this.frame.setVisible(true);
    }

    public void mover(String nomeEstoque, JframePrincipal frameprincipal, Popup_Botoes_Predio_interface pop ,Estoque estoque, int predio, int lado, int nivel){

        int predio_part = predio;
        int lado_part = lado;
        int nivel_part = nivel;

        if(this.inputPredioDestino.getText().matches("\\d+") && this.inputLadoDestino.getText().matches("\\d+") && this.inputNivelDestino.getText().matches("\\d+") && this.inputQuantidade.getText().matches("\\d+")){
            //System.out.println("ENTROU");
            int predio_dest = Integer.parseInt(this.inputPredioDestino.getText());
            int lado_dest = Integer.parseInt(this.inputLadoDestino.getText());
            int nivel_dest = Integer.parseInt(this.inputNivelDestino.getText());
            int qtd = Integer.parseInt(this.inputQuantidade.getText());

            int qtd_predios = estoque.pegarNumeroPredios();
            int qtd_lados = estoque.pegarNumeroLados();
            int qtd_niveis = estoque.pegarNumeroNiveis();
            qtd_predios -= 1;
            qtd_lados -= 1;
            qtd_niveis -= 1; 

            predio_dest -= 1;
            lado_dest -= 1;
            nivel_dest -= 1;

            if(predio_dest <= qtd_predios && lado_dest <= qtd_lados && nivel_dest <= qtd_niveis){
                if(qtd > 0){
                    if(estoque.existeProduto(predio_dest, lado_dest, nivel_dest)){
                        if(estoque.mesmoProduto(predio_part, lado_part, nivel_part, predio_dest, lado_dest, nivel_dest)){
                            if(!(predio_part == predio_dest && lado_part == lado_dest && nivel_part == nivel_dest)){
                                //CASO DE MOVER UM PRODUTO PARA UM ESPAÇO COM O MESMO PRODUTO
                                int qtdArquivoPart = estoque.pegarQuantidade(predio_part, lado_part, nivel_part);
                                int novaQuantidadePart = qtdArquivoPart - qtd;
                                
                                int qtdArquivoDest = estoque.pegarQuantidade(predio_dest, lado_dest, nivel_dest);
                                int novaQuantidadeDest = qtdArquivoDest + qtd;

                                int codigo = estoque.pegarCodigoProduto(predio_dest, lado_dest, nivel_dest);
                                int dia = estoque.pegarDiaValidade(predio_dest, lado_dest, nivel_dest);
                                int mes = estoque.pegarMesValidade(predio_dest, lado_dest, nivel_dest);
                                int ano = estoque.pegarAnoValidade(predio_dest, lado_dest, nivel_dest);


                                estoque.subtrairQuantidade(predio_part, lado_part, nivel_part, qtd);
                                estoque.incrementarQuantidade(predio_dest, lado_dest, nivel_dest, qtd);


                                //String nomeEstoque = "aiai";
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
                                        //System.out.println("ENTROU LOOP");
                                        String[] coluna = linha.split(";");
                                        if(linha != ""){
                                            //LOCAL PARTIDA
                                            if((Integer.parseInt(coluna[0]) == predio_part )&& Integer.parseInt(coluna[1])==lado_part && Integer.parseInt(coluna[2])==nivel_part && Integer.parseInt(coluna[3])==codigo && Integer.parseInt(coluna[4])==dia && Integer.parseInt(coluna[5])==mes &&Integer.parseInt(coluna[6])==ano && Integer.parseInt(coluna[7])==qtdArquivoPart){
                                                if(novaQuantidadePart > 0){
                                                    String a =(""+coluna[0]+";"+coluna[1]+";"+coluna[2]+";"+coluna[3]+";"+coluna[4]+";"+coluna[5]+";"+coluna[6]+";"+novaQuantidadePart+"");
                                                    array.add(a);
                                                }
                                            }//LOCAL DESTINO
                                            else if((Integer.parseInt(coluna[0]) == predio_dest )&& Integer.parseInt(coluna[1])==lado_dest && Integer.parseInt(coluna[2])==nivel_dest && Integer.parseInt(coluna[3])==codigo && Integer.parseInt(coluna[4])==dia && Integer.parseInt(coluna[5])==mes &&Integer.parseInt(coluna[6])==ano && Integer.parseInt(coluna[7])==qtdArquivoDest){
                                                if(novaQuantidadeDest > 0){
                                                    String a =(""+coluna[0]+";"+coluna[1]+";"+coluna[2]+";"+coluna[3]+";"+coluna[4]+";"+coluna[5]+";"+coluna[6]+";"+novaQuantidadeDest+"");
                                                    array.add(a);
                                                }
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
                                frameprincipal.verificarValidadeEstoque(estoque);
                                pop.atualizarInformacoes(estoque, predio, lado, nivel);
                                pop.fecharJanela();
                            }
                            else JOptionPane.showMessageDialog(null, "São pessoas feito você que fazem o programador ter que tratar esse tipo de exceção >:(", null, JOptionPane.ERROR_MESSAGE);
                            
                        }













                }else if(!(estoque.existeProduto(predio_dest, lado_dest, nivel_dest))){
                    //CASO DE MOVER UM PRODUTO PARA UM ESPAÇO VAZIO
                    int qtdArquivoPart = estoque.pegarQuantidade(predio_part, lado_part, nivel_part);
                    int novaQuantidadePart = qtdArquivoPart - qtd;

                    int novaQuantidadeDest = qtd;

                    int codigo = estoque.pegarCodigoProduto(predio_part, lado_part, nivel_part);
                    int dia = estoque.pegarDiaValidade(predio_part, lado_part, nivel_part);
                    int mes = estoque.pegarMesValidade(predio_part, lado_part, nivel_part);
                    int ano = estoque.pegarAnoValidade(predio_part, lado_part, nivel_part);

                    /*OPERAÇÃO NO BACK-END */
                    estoque.subtrairQuantidade(predio_part, lado_part, nivel_part, qtd);
                    estoque.incrementarQuantidade(predio_dest, lado_dest, nivel_dest, qtd);/*ESSA LINHA É NECESSÁRIA? */
                    
                    Produto produto = new Produto(codigo);
                    produto.setDia_val(dia);
                    produto.setMes_val(mes);
                    produto.setAno_val(ano);

                    estoque.inserir(produto, predio_dest, lado_dest, nivel_dest, qtd);


                    /*ESCREVER NO ARQUIVO COMO SE ESTIVESSE ADICIONANDO*/
                    String path = "SistemaControleEstoque/src/arquivosEstoque/"+nomeEstoque+"/"+nomeEstoque+"ProdutosEstoque"+"/"+nomeEstoque+"ProdutosEstoque.csv";
                    File file = new File(path);
                    BufferedWriter bw;
                    try {
                        bw = new BufferedWriter(new FileWriter(file, true));
                        bw.write(predio_dest+";"+lado_dest+";"+nivel_dest+";"+codigo+";"+dia+";"+mes+";"+ano+";"+novaQuantidadeDest+"\n");
                        bw.flush();
                        bw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    /*ESCREVENDO NO ARQUIVO COMO VAI FICAR O PRÉDIO PARTIDA*/

                    ArrayList<String> array = new ArrayList<>();

                    //PEGANDO UM ARQUIVO IGUAL
                    BufferedReader reader = null;
                    String linha = "";
                    try {
                        reader = new BufferedReader(new FileReader(file));
                        linha = reader.readLine();//PARA PULAR A PRIMEIRA LINHA
                        while((linha = reader.readLine()) != null){
                            //System.out.println("ENTROU LOOP");
                            String[] coluna = linha.split(";");
                            if(linha != ""){
                                if((Integer.parseInt(coluna[0]) == predio_part )&& Integer.parseInt(coluna[1])==lado_part && Integer.parseInt(coluna[2])==nivel_part && Integer.parseInt(coluna[3])==codigo && Integer.parseInt(coluna[4])==dia && Integer.parseInt(coluna[5])==mes &&Integer.parseInt(coluna[6])==ano && Integer.parseInt(coluna[7])==qtdArquivoPart){
                                    if(novaQuantidadePart > 0){
                                        String a =(""+coluna[0]+";"+coluna[1]+";"+coluna[2]+";"+coluna[3]+";"+coluna[4]+";"+coluna[5]+";"+coluna[6]+";"+novaQuantidadePart+"");
                                        array.add(a);
                                    }
                                }else{
                                    array.add(linha);
                                }
                            }
                        }
                        reader.close();
        
                        BufferedWriter bw3;
                        bw3 = new BufferedWriter(new FileWriter(file, true));
                        bw3.close(); 
                        
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

                    //System.out.println("DEU CERTO2");
                    this.frame.dispose();
                    frameprincipal.atualizarOsBotoes(estoque);
                    frameprincipal.verificarValidadeEstoque(estoque);
                    pop.atualizarInformacoes(estoque, predio_part, lado_part, nivel_part);
                    pop.fecharJanela();
                }else JOptionPane.showMessageDialog(null, "Há um produto diferente no local indicado!", null, JOptionPane.ERROR_MESSAGE); 
            }else JOptionPane.showMessageDialog(null, "Tentando remover zero quantidades do produto? 0-o", null, JOptionPane.ERROR_MESSAGE);
            }else JOptionPane.showMessageDialog(null, "Algum dos locais indicados não existe!", null, JOptionPane.ERROR_MESSAGE);
             
            
        }else JOptionPane.showMessageDialog(null, "Valores Inválidos!", null, JOptionPane.ERROR_MESSAGE);
        
    }

    public static void main(String[] args) {
        int qtd_lados = 2;
        int qtd_niveis = 2;
        int qtd_predio = 2; 
        Estoque estoque = new Estoque();
        estoque.iniciarEstoque(estoque, qtd_predio, qtd_lados, qtd_niveis);
        
        Produto produto = new Produto(1014);
        produto.setDia_val(1);
        produto.setMes_val(1);
        produto.setAno_val(2023);
        estoque.inserir(produto, qtd_predio - 1, qtd_lados - 1, qtd_niveis - 1, qtd_predio+8);
        estoque.inserir(produto, qtd_predio - 2, qtd_lados - 2, qtd_niveis - 2, qtd_predio);

        //Popup_Mover_Produto p = new Popup_Mover_Produto(estoque, qtd_predio, qtd_lados, qtd_niveis);
    }
}
