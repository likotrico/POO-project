package lainterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import estoque.Estoque;
import estoque.Produto;

public class Popup_Adicionar_Produto {
    
    private JFrame frame; //OK

    private JLabel textoAdicionarProduto; //OK
    private JLabel textoCodigoProduto; //OK
    private JLabel textoValidadeProduto; //OK
    private JLabel textoQuantidadeProduto;
    private JLabel barrinhaCool; //OK
    private JLabel barrinhaCool2; //OK

    private JTextField inputCodigoProduto; //OK
    private JTextField inputDiaValidade; //OK
    private JTextField inputMesValidade; //OK
    private JTextField inputAnoValidade; //OK
    private JTextField inputQuantidadeProduto; //OK

    private JButton botaoAdicionar; //OK
    private JButton botaoCancelar; //OK

    public Popup_Adicionar_Produto(String nomeEstoque, JframePrincipal frameprincipal, Popup_Botoes_Predio_interface popup ,Estoque estoque, int predio, int lado, int nivel){

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(280, 320);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame = frame;

        //ADICIONANDO TEXTO ADICIONAR PRODUTO
        JLabel label1 = new JLabel();
        label1.setBackground(Color.BLUE);
        //label1.setOpaque(true);
        Font fonte1 = new Font("Adicionar Produto", Font.BOLD, 20);
        label1.setFont(fonte1);
        label1.setText(fonte1.getName());
        label1.setBounds(50, 0, 180, 30);
        this.textoAdicionarProduto = label1;

        //ADICIONANDO O TEXTO CÓDIGO PRODUTO
        JLabel label2 = new JLabel();
        label2.setBackground(Color.RED);
        //label2.setOpaque(true);
        Font fonte2 = new Font("Código:", Font.BOLD, 15);
        label2.setFont(fonte2);
        label2.setText(fonte2.getName());
        label2.setBounds(20, 50, 55, 30);
        this.textoCodigoProduto = label2;

        //ADICIONANDO O INPUT DO CÓDIGO PRODUTO
        JTextField textfield1 = new JTextField();
        textfield1.setBounds(120, 50, 90, 30);  
        this.inputCodigoProduto = textfield1;

        //ADICIONANDO O TEXTO VALIDADE PRODUTO
        JLabel label3 = new JLabel();
        label3.setBackground(Color.GREEN);
        //label3.setOpaque(true);
        Font fonte3 = new Font("Validade:", Font.BOLD, 15);
        label3.setFont(fonte3);
        label3.setText(fonte3.getName());
        label3.setBounds(20, 90, 70, 30);
        this.textoValidadeProduto = label3;

        //ADICIONANDO INPUT DO DIA VALIDADE
        JTextField textfield2 = new JTextField();
        textfield2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (textfield2.getText().length() >= 2 )
                    e.consume(); 
            }}); 
            textfield2.setBounds(120, 90, 20, 30);
            this.inputDiaValidade = textfield2;
        
        //ADICIONANDO BARRINHA 
        JLabel barrinha = new JLabel();
        barrinha.setBackground(Color.gray);
        //barrinha.setOpaque(true);
        Font fonteBarrinha = new Font("/", Font.BOLD, 15);
        barrinha.setFont(fonteBarrinha);
        barrinha.setText(fonteBarrinha.getName());
        barrinha.setBounds(140, 90, 5, 30);
        this.barrinhaCool = barrinha;

        //ADICIONANDO INPUT DO MÊS VALIDADE
        JTextField textfield3 = new JTextField();
        textfield3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (textfield3.getText().length() >= 2 )
                    e.consume(); 
            }}); 
            textfield3.setBounds(145, 90, 20, 30);
            this.inputMesValidade = textfield3;

        //ADICIONANDO BARRINHA2
        JLabel barrinha2 = new JLabel();
        barrinha2.setBackground(Color.gray);
        //barrinha2.setOpaque(true);
        barrinha2.setFont(fonteBarrinha);
        barrinha2.setText(fonteBarrinha.getName());
        barrinha2.setBounds(165, 90, 5, 30);
        this.barrinhaCool2 = barrinha2;

        //ADICIONANDO INPUT DO ANO VALIDADE
        JTextField textfield4 = new JTextField();
        textfield4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (textfield4.getText().length() >= 4 )
                    e.consume(); 
            }}); 
            textfield4.setBounds(170, 90, 40, 30);
            this.inputAnoValidade = textfield4;

        //ADICIONANDO JLABEL TEXTO QUANTIDADE
        JLabel label4 = new JLabel();
        label4.setBackground(Color.YELLOW);
        //label4.setOpaque(true);
        Font fonte4 = new Font("Quantidade:", Font.BOLD, 15);
        label4.setFont(fonte4);
        label4.setText(fonte4.getName());
        label4.setBounds(20, 130, 90, 30);
        this.textoQuantidadeProduto = label4;

        //ADICIONANDO INPUT QUANTIDADE PRODUTO
        JTextField textfield5 = new JTextField();
        textfield5.setBounds(120, 130, 90, 30);
        this.inputQuantidadeProduto = textfield5;

        //ADICIONANDO BOTAO ADICIONAR
        JButton botao1 = new JButton();
        botao1.setFocusable(false);
        botao1.addActionListener(e -> adicionar(nomeEstoque, frameprincipal, popup, estoque, predio, lado, nivel));
        Font fontebotao1 = new Font("Adicionar", Font.BOLD, 13);
        botao1.setFont(fontebotao1);
        botao1.setText(fontebotao1.getName());
        botao1.setBounds(20, 180, 110, 30);
        this.botaoAdicionar = botao1;

        //ADICIONANDO BOTAO CANCELAR
        JButton botao2 = new JButton();
        botao2.setFocusable(false);
        botao2.addActionListener(e -> this.frame.dispose());
        Font fontebotao2 = new Font("Cancelar", Font.BOLD, 13);
        botao2.setFont(fontebotao2);
        botao2.setText(fontebotao2.getName());
        botao2.setBounds(20, 220, 110, 30);
        this.botaoCancelar = botao2;
        
        //ADICIONANDO JLABELS
        this.frame.add(this.textoAdicionarProduto);
        this.frame.add(this.textoCodigoProduto);
        this.frame.add(this.textoValidadeProduto);
        this.frame.add(this.textoQuantidadeProduto);

        this.frame.add(this.barrinhaCool);
        this.frame.add(this.barrinhaCool2);

        //ADICIONANDO OS TEXTFIELDS
        this.frame.add(this.inputCodigoProduto);
        this.frame.add(this.inputDiaValidade);
        this.frame.add(this.inputMesValidade);
        this.frame.add(this.inputAnoValidade);
        this.frame.add(this.inputQuantidadeProduto);

        //ADICIONANDO OS BOTÕES
        this.frame.add(this.botaoAdicionar);
        this.frame.add(this.botaoCancelar);

        this.frame.setVisible(true);
    }

    public void adicionar(String nomeEstoque, JframePrincipal frameprincipal, Popup_Botoes_Predio_interface popup ,Estoque estoque, int predio, int lado, int nivel){
        if(this.inputCodigoProduto.getText().matches("\\d+") && this.inputDiaValidade.getText().matches("\\d+") && this.inputMesValidade.getText().matches("\\d+") && this.inputAnoValidade.getText().matches("\\d+")){
            Produto produto = new Produto(Integer.parseInt(this.inputCodigoProduto.getText()));
            produto.setDia_val(Integer.parseInt(this.inputDiaValidade.getText()));
            produto.setMes_val(Integer.parseInt(this.inputMesValidade.getText()));
            produto.setAno_val(Integer.parseInt(this.inputAnoValidade.getText()));
            
            estoque.inserir(produto, predio, lado, nivel, Integer.parseInt(this.inputQuantidadeProduto.getText()));
            
            String path = "SistemaControleEstoque/src/arquivosEstoque/"+nomeEstoque+"/"+nomeEstoque+"ProdutosEstoque"+"/"+nomeEstoque+"ProdutosEstoque.csv";
            File file = new File(path);
            BufferedWriter bw;
            try {
                bw = new BufferedWriter(new FileWriter(file, true));
                bw.write(predio+";"+lado+";"+nivel+";"+produto.getCodigo()+";"+produto.getDia_val()+";"+produto.getMes_val()+";"+produto.getAno_val()+";"+this.inputQuantidadeProduto.getText()+"\n");
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            
            this.frame.dispose();
            popup.atualizarInformacoes(estoque, predio, lado, nivel);
            frameprincipal.atualizarOsBotoes(estoque);
            frameprincipal.verificarValidadeEstoque(estoque);
        }else JOptionPane.showMessageDialog(null, "Valores Inválidos!", null, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void main(String[] args) {
        //int qtd_predios = 2;
        int qtd_lados = 2;
        int qtd_niveis = 2;
        int predio = 2; 
        Estoque estoque = new Estoque();
        estoque.iniciarEstoque(estoque, predio, qtd_lados, qtd_niveis);

        //Popup_Adicionar_Produto pop = new Popup_Adicionar_Produto(new JframePrincipal(qtd_lados, qtd_niveis, qtd_predios), estoque, predio, qtd_lados, qtd_niveis);
        while(true){
            estoque.imprimirEstoque(estoque);
        }
    }
    
}
