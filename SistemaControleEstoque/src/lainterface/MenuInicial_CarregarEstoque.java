package lainterface;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import estoque.Estoque;
import estoque.Produto;
import usuarios.Interno;

public class MenuInicial_CarregarEstoque {
    
    private JFrame frame;

    private JLabel textoCarregarEstoque;
    private JLabel textoNome;

    private JTextField inputNome;

    private JButton botaoCarregarEstoque;
    private JButton botaoCancelar;

    public MenuInicial_CarregarEstoque(Interno interno){
        //ADICIONANDO O JFRAME
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(340, 250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame = frame;

        //ADICIONANDO O JLABEL TEXTO CARREGAR ESTOQUE 
        JLabel label1 = new JLabel();
        label1.setBackground(Color.RED);
        label1.setOpaque(true);
        Font fonte1 = new Font("Carregar Estoque", Font.BOLD, 20);
        label1.setFont(fonte1);
        label1.setText(fonte1.getName());
        label1.setBounds(85, 0, 170, 25);
        this.textoCarregarEstoque = label1;

        //ADICIONANDO O JLABEL TEXTO NOME 
        JLabel label2 = new JLabel();
        label2.setBackground(Color.BLUE);
        label2.setOpaque(true);
        Font fonte2 = new Font("Nome:", Font.BOLD, 15);
        label2.setFont(fonte2);
        label2.setText(fonte2.getName());
        label2.setBounds(35, 50, 50, 25);
        this.textoNome = label2;

        //ADICIONANDO O JTEXTFIELD INPUT NOME
        JTextField text2 = new JTextField();
        text2.setBounds(105, 50, 190, 25);
        this.inputNome = text2;

        //ADICIONANDO O JBUTTON CARREGAR
        JButton botao1 = new JButton();
        botao1.setFocusable(false);
        botao1.addActionListener(e -> this.carregarEstoque(interno));
        Font fontebotao = new Font("Carregar", Font.BOLD, 15);
        botao1.setFont(fontebotao);
        botao1.setText(fontebotao.getName());
        botao1.setBounds(120, 105, 100, 25);
        this.botaoCarregarEstoque = botao1;

        //ADICIONANDO O JBUTTON CANCELAR
        JButton botao2 = new JButton();
        botao2.setFocusable(false);
        botao2.addActionListener(e->this.frame.dispose());
        Font fontebotao2 = new Font("Cancelar", Font.BOLD, 15);
        botao2.setFont(fontebotao2);
        botao2.setText(fontebotao2.getName());
        botao2.setBounds(120, 140, 100, 25);
        this.botaoCancelar = botao2;

        this.frame.add(this.textoCarregarEstoque);
        this.frame.add(this.textoNome);
        this.frame.add(this.inputNome);
        this.frame.add(this.botaoCarregarEstoque);
        this.frame.add(this.botaoCancelar);

        this.frame.setVisible(true);
    }

    public void carregarEstoque(Interno interno){
        if(this.inputNome.getText() != ""){
            String nome = this.inputNome.getText();
            String path = "SistemaControleEstoque/src/arquivosEstoque/"+nome;
            String pathProdutos = "SistemaControleEstoque/src/arquivosEstoque/"+nome+"/"+nome+"ProdutosEstoque"+"/"+nome+"ProdutosEstoque.csv";

            File file = new File(path+"/"+nome+".csv");
            File file2 = new File(pathProdutos);

            BufferedReader reader = null;
            String linha = "";
            int qtd_predio, qtd_lado, qtd_nivel;
            //PEGANDO AS INFORMAÇÕES DOS PRÉDIOS, LADOS E NÍVEIS
            try{
                reader = new BufferedReader(new FileReader(file));
                reader.readLine();//PARA PULAR A PRIMEIRA LINHA
                while((linha = reader.readLine()) != null){
                    String[] coluna = linha.split(";");
                    qtd_predio = Integer.parseInt(coluna[0]);
                    qtd_lado = Integer.parseInt(coluna[1]);
                    qtd_nivel = Integer.parseInt(coluna[2]);
                    Estoque estoque = new Estoque();
                    System.out.println("OK");
                    estoque.iniciarEstoque(estoque, qtd_predio, qtd_lado, qtd_nivel);
                    BufferedReader reader2 = null;
                    String linha2 = "";
                    try{
                        reader2 = new BufferedReader(new FileReader(file2));
                        linha2 = reader2.readLine();//PARA PULAR A PRIMEIRA LINHA
                        System.out.println(linha2);
                        while((linha2 = reader2.readLine()) != null){
                            String[] coluna2 = linha2.split(";");
                            //bw2.write("predio;lado;nivel;codigo;dia;mes;ano;quantidade\n");
                            int predio = Integer.parseInt(coluna2[0]);
                            int lado = Integer.parseInt(coluna2[1]);
                            int nivel = Integer.parseInt(coluna2[2]);
                            int codigo = Integer.parseInt(coluna2[3]);
                            int dia = Integer.parseInt(coluna2[4]);
                            int mes = Integer.parseInt(coluna2[5]);
                            int ano = Integer.parseInt(coluna2[6]);
                            int quantidade = Integer.parseInt(coluna2[7]);

                            Produto produto = new Produto(codigo);
                            produto.setDia_val(dia);
                            produto.setMes_val(mes);
                            produto.setAno_val(ano);

                            estoque.inserir(produto, predio, lado, nivel, quantidade);
                            
                        }
                        reader2.close();
                        this.frame.dispose();
                        JframePrincipal frameprincipal = new JframePrincipal();
                        frameprincipal.iniciarFrame(nome, interno, frameprincipal, estoque, qtd_lado, qtd_nivel, qtd_predio);
                        frameprincipal.atualizarOsBotoes(estoque);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                reader.close();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
       // new MenuInicial_CarregarEstoque();
    }

}
