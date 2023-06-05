package lainterface;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuInicial_CriarEstoque {
    
    private JFrame frame; //OK

    private JLabel textoCriarEstoque; //OK
    private JLabel textoNomeEstoque; //OK
    private JLabel textoQtdPredio; //OK
    private JLabel textoQtdLado; //OK 
    private JLabel textoQtdNivel; //OK

    private JTextField inputNomeEstoque; //OK
    private JTextField inputPredio; //OK 
    private JTextField inputLado; //OK
    private JTextField inputNivel; //OK

    private JButton botaoCriarEstoque;
    private JButton botaoCancelar;

    public MenuInicial_CriarEstoque(){
        //ADICIONANDO O JFRAME
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame = frame;

        //ADICIONANDO O JLABEL TEXTO NOME ESTOQUE
        JLabel label1 = new JLabel();
        label1.setBackground(Color.RED);
        //label1.setOpaque(true);
        Font fonte1 = new Font("Criar Novo Estoque", Font.BOLD, 20);
        label1.setFont(fonte1);
        label1.setText(fonte1.getName());
        label1.setBounds(105, 0, 190, 25);
        this.textoCriarEstoque = label1;

        //ADICIONANDO O JLABEL TEXTO NOME ESTOQUE
        JLabel label2 = new JLabel();
        label2.setBackground(Color.BLUE);
        //label2.setOpaque(true);
        Font fonte2 = new Font("Nome:", Font.BOLD, 15);
        label2.setFont(fonte2);
        label2.setText(fonte2.getName());
        label2.setBounds(35, 50, 50, 25);
        this.textoNomeEstoque = label2;

        //ADICIONANDO O JTEXTFIELD INPUT NOME ESTOQUE
        JTextField text2 = new JTextField();
        text2.setBounds(105, 50, 190, 25);
        this.inputNomeEstoque = text2;

        //ADICIONANDO O JLABEL TEXTO QTD PREDIO
        JLabel label3 = new JLabel();
        label3.setBackground(Color.GREEN);
        //label3.setOpaque(true);
        Font fonte3 = new Font("Quantidade de Prédios:", Font.BOLD, 15);
        label3.setFont(fonte3);
        label3.setText(fonte3.getName());
        label3.setBounds(35, 100, 170, 25);
        this.textoQtdPredio = label3;

        //ADICIONANDO O JTEXTFIELD INPUT QTD PRÉDIOS
        JTextField text3 = new JTextField();
        text3.setBounds(220, 100, 40, 25);
        this.inputPredio = text3;

        //ADICIONANDO O JLABEL TEXTO QTD LADO
        JLabel label4 = new JLabel();
        label4.setBackground(Color.YELLOW);
        //label4.setOpaque(true);
        Font fonte4 = new Font("Quantidade de Lados:", Font.BOLD, 15);
        label4.setFont(fonte4);
        label4.setText(fonte4.getName());
        label4.setBounds(35, 150, 170, 25);
        this.textoQtdLado = label4;

        //ADICIONANDO O JTEXTFIELD INPUT QTD LADO
        JTextField text4 = new JTextField();
        text4.setBounds(220, 150, 40, 25);
        this.inputLado = text4;

        //ADICIONANDO O JLABEL TEXTO QTD NÍVEL
        JLabel label5 = new JLabel();
        label5.setBackground(Color.PINK);
        //label5.setOpaque(true);
        Font fonte5 = new Font("Quantidade de Níveis:", Font.BOLD, 15);
        label5.setFont(fonte5);
        label5.setText(fonte5.getName());
        label5.setBounds(35, 200, 170, 25);
        this.textoQtdNivel = label5;

        //ADICIONANDO O JTEXTFIELD INPUT QTD NÍVEL
        JTextField text5 = new JTextField();
        text5.setBounds(220, 200, 40, 25);
        this.inputNivel = text5;

        //ADICIONANDO O JBUTTON CRIAR
        JButton botao1 = new JButton();
        botao1.setFocusable(false);
        botao1.addActionListener(e -> criarEstoque());
        Font fontebotao = new Font("Criar", Font.BOLD, 15);
        botao1.setFont(fontebotao);
        botao1.setText(fontebotao.getName());
        botao1.setBounds(140, 250, 100, 25);
        this.botaoCriarEstoque = botao1;

        //ADICIONANDO O JBUTTON CANCELAR
        JButton botao2 = new JButton();
        botao2.setFocusable(false);
        botao2.addActionListener(e->this.frame.dispose());
        Font fontebotao2 = new Font("Cancelar", Font.BOLD, 15);
        botao2.setFont(fontebotao2);
        botao2.setText(fontebotao2.getName());
        botao2.setBounds(140, 285, 100, 25);
        this.botaoCancelar = botao2;

        //ADICIONANDO LABELS
        this.frame.add(this.textoCriarEstoque);
        this.frame.add(this.textoNomeEstoque);
        this.frame.add(this.textoQtdPredio);
        this.frame.add(this.textoQtdLado);
        this.frame.add(this.textoQtdNivel);

        //ADICIONANDO TEXTFIELDS
        this.frame.add(this.inputNomeEstoque);
        this.frame.add(this.inputPredio);
        this.frame.add(this.inputLado);
        this.frame.add(this.inputNivel);

        //ADICIONANDO BOTÕES
        this.frame.add(this.botaoCriarEstoque);
        this.frame.add(this.botaoCancelar);

        this.frame.setVisible(true);
    }

    public void criarEstoque(){
        
        if(inputPredio.getText().matches("[0-9]*") && inputLado.getText().matches("[0-9]*") && inputNivel.getText().matches("[0-9]*")){
            int qtd_predio = Integer.parseInt(inputPredio.getText());
            int qtd_lado = Integer.parseInt(inputLado.getText());
            int qtd_nivel = Integer.parseInt(inputNivel.getText());

            String nome = ""+inputNomeEstoque.getText();
            try{
                File file = new File(nome+".csv");
                file.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write("qtd_predio;qtd_lado;qtd_nivel\n");
                bw.write(qtd_predio+";"+qtd_lado+";"+qtd_nivel);
                bw.flush();
                bw.close();
                this.frame.dispose();
            }catch(Exception e){
                //e.printStackTrace();
                System.out.println("Erro ao criar o arquivo "+nome);
            }
        }else{
            System.out.println("Digite um valor válido");
        }
    }



    public static void main(String[] args) {
        MenuInicial_CriarEstoque menuCriarEstoque = new MenuInicial_CriarEstoque();
    }

    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JLabel getTextoCriarEstoque() {
        return textoCriarEstoque;
    }
    public void setTextoCriarEstoque(JLabel textoCriarEstoque) {
        this.textoCriarEstoque = textoCriarEstoque;
    }
    public JLabel getTextoNomeEstoque() {
        return textoNomeEstoque;
    }
    public void setTextoNomeEstoque(JLabel textoNomeEstoque) {
        this.textoNomeEstoque = textoNomeEstoque;
    }
    public JLabel getTextoQtdPredio() {
        return textoQtdPredio;
    }
    public void setTextoQtdPredio(JLabel textoQtdPredio) {
        this.textoQtdPredio = textoQtdPredio;
    }
    public JLabel getTextoQtdLado() {
        return textoQtdLado;
    }
    public void setTextoQtdLado(JLabel textoQtdLado) {
        this.textoQtdLado = textoQtdLado;
    }
    public JLabel getTextoQtdNivel() {
        return textoQtdNivel;
    }
    public void setTextoQtdNivel(JLabel textoQtdNivel) {
        this.textoQtdNivel = textoQtdNivel;
    }
    public JTextField getInputNomeEstoque() {
        return inputNomeEstoque;
    }
    public void setInputNomeEstoque(JTextField inputNomeEstoque) {
        this.inputNomeEstoque = inputNomeEstoque;
    }
    public JTextField getInputPredio() {
        return inputPredio;
    }
    public void setInputPredio(JTextField inputPredio) {
        this.inputPredio = inputPredio;
    }
    public JTextField getInputLado() {
        return inputLado;
    }
    public void setInputLado(JTextField inputLado) {
        this.inputLado = inputLado;
    }
    public JTextField getInputNivel() {
        return inputNivel;
    }
    public void setInputNivel(JTextField inputNivel) {
        this.inputNivel = inputNivel;
    }
    public JButton getBotaoCriarEstoque() {
        return botaoCriarEstoque;
    }
    public void setBotaoCriarEstoque(JButton botaoCriarEstoque) {
        this.botaoCriarEstoque = botaoCriarEstoque;
    }
    public JButton getBotaoCancelar() {
        return botaoCancelar;
    }
    public void setBotaoCancelar(JButton botaoCancelar) {
        this.botaoCancelar = botaoCancelar;
    }


}
