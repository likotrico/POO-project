import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import estoque.Estoque;

public class Popup_Botoes_Predio_interface {
    
    private JFrame frame; //OK

    private JLabel textoPredio; //OK
    private JLabel textoLado; //OK
    private JLabel textoNivel; //OK
    private JLabel textoProdutoCodigo; //OK
    private JLabel textoQuantidade; // OK
    private JLabel textoValidade; // OK

    private JLabel informacaoPredio; //OK
    private JLabel informacaoLado; //OK
    private JLabel informacaoNivel; //OK
    private JLabel informacaoProdutoCodigo; //OK
    private JLabel informacaoQuantidade; //OK
    private JLabel informacaoValidade; //OK

    private JButton botaoAdicionar; //OK
    private JButton botaoRemover; //OK
    private JButton botaoMover; //OK 
    private JButton botaoCancelar; //OK

    private int predio;
    private int lado;
    private int nivel;

    public Popup_Botoes_Predio_interface(JframePrincipal frameprincipal, Estoque estoque,  int predio, int lado, int nivel){
        this.predio = predio;
        this.lado = lado;
        this.nivel = nivel;

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame = frame;

        //ADICIONANDO O TEXTO PRÉDIO
        JLabel label1 = new JLabel();
        label1.setBackground(Color.RED);
        //label1.setOpaque(true);
        Font fonte = new Font("Prédio:", Font.BOLD, 17);
        label1.setFont(fonte);
        label1.setText(fonte.getName());
        label1.setBounds(105, 10, 60, 30);
        this.textoPredio = label1;

        //ADICIONANDO A INFORMAÇÃO DO PRÉDIO
        JLabel infolabel = new JLabel();
        infolabel.setBackground(Color.PINK);
        //infolabel.setOpaque(true);
        Font infofonte = new Font( ""+this.predio, Font.BOLD, 17);
        infolabel.setFont(infofonte);
        infolabel.setText(infofonte.getName());
        infolabel.setBounds(165, 10, 40, 30);
        this.informacaoPredio = infolabel;

        //ADICIONANDO O TEXTO LADO
        JLabel label2 = new JLabel();
        label2.setBackground(Color.BLUE);
        //label2.setOpaque(true);
        Font fonte2 = new Font("Lado:", Font.BOLD, 17);
        label2.setFont(fonte2);
        label2.setText(fonte2.getName());
        label2.setBounds(210, 10, 50, 30);
        this.textoLado = label2;
        
        //ADICIONANDO A INFORMAÇÃO LADO
        JLabel infoLabel2 = new JLabel();
        infoLabel2.setBackground(Color.GRAY);
        //infoLabel2.setOpaque(true);
        Font infofonte2 = new Font(""+this.lado, Font.BOLD, 17);
        infoLabel2.setFont(infofonte2);
        infoLabel2.setText(infofonte2.getName());
        infoLabel2.setBounds(260, 10, 40, 30);
        this.informacaoLado = infoLabel2;

        //ADICIONANDO O TEXTO NÍVEL
        JLabel label3 = new JLabel();
        label3.setBackground(Color.GREEN);
        //label3.setOpaque(true);
        Font fonte3 = new Font("Nível:", Font.BOLD, 17);
        label3.setFont(fonte3);
        label3.setText(fonte3.getName());
        label3.setBounds(305, 10, 50, 30);
        this.textoNivel = label3;

        //ADICIONANDO INFORMAÇÃO DO NÍVEL
        JLabel infoLabel3 = new JLabel();
        infoLabel3.setBackground(Color.CYAN);
        //infoLabel3.setOpaque(true);
        Font infofonte3 = new Font(""+this.nivel, Font.BOLD, 17);
        infoLabel3.setFont(infofonte3);
        infoLabel3.setText(infofonte3.getName());
        infoLabel3.setBounds(355, 10, 40, 30);
        this.informacaoNivel = infoLabel3;

        //ADICIONANDO TEXTO PRODUTO CÓDIGO
        JLabel label4 = new JLabel();
        label4.setBackground(Color.RED);
        //label4.setOpaque(true);
        Font fonte4 = new Font("Código:", 0, 15);
        label4.setFont(fonte4);
        label4.setText(fonte4.getName());
        label4.setBounds(105, 55, 80, 30);
        this.textoProdutoCodigo = label4;

        //ADICIONANDO INFORMAÇÃO PRODUTO CÓDIGO
        JLabel infoLabel4 = new JLabel();
        infoLabel4.setBackground(Color.CYAN);
        //infoLabel4.setOpaque(true);
        Font infofonte4 = new Font("0000000000", Font.BOLD, 15);
        infoLabel4.setFont(infofonte4);
        infoLabel4.setText(infofonte4.getName());
        infoLabel4.setBounds(185, 55, 100, 30);
        this.informacaoProdutoCodigo = infoLabel4;

        //ADIOCIONANDO TEXTO VALIDADE
        JLabel label5 = new JLabel();
        label5.setBackground(Color.BLUE);
        //label5.setOpaque(true);
        Font fonte5 = new Font("Validade:", 0, 15);
        label5.setFont(fonte5);
        label5.setText(fonte5.getName());
        label5.setBounds(105, 85, 80, 30);
        this.textoValidade = label5;

        //ADICIONANDO INFORMAÇÃO TEXTO VALIDADE
        JLabel infoLabel5 = new JLabel();
        infoLabel5.setBackground(Color.ORANGE);
        //infoLabel5.setOpaque(true);
        Font infofonte5 = new Font("00/00/0000", Font.BOLD, 15);
        infoLabel5.setFont(infofonte5);
        infoLabel5.setText(infofonte5.getName());
        infoLabel5.setBounds(185, 85, 100, 30);
        this.informacaoValidade = infoLabel5;

        //ADICIONANDO TEXTO QUANTIDADE
        JLabel label6 = new JLabel();
        label6.setBackground(Color.GREEN);
        //label6.setOpaque(true);
        Font fonte6 = new Font("Quantidade:", 0, 15);
        label6.setFont(fonte6);
        label6.setText(fonte6.getName());
        label6.setBounds(105, 115, 80, 30);
        this.textoQuantidade = label6;

        //ADICIONANDO INFORMAÇÃO TEXTO QUANTIDADE
        JLabel infoLabel6 = new JLabel();
        infoLabel6.setBackground(Color.MAGENTA);
        //infoLabel6.setOpaque(true);
        Font infofonte6 = new Font("0000000000", Font.BOLD, 15);
        infoLabel6.setFont(infofonte6);
        infoLabel6.setText(infofonte6.getName());
        infoLabel6.setBounds(185, 115, 100, 30);
        this.informacaoQuantidade = infoLabel6;

        //ADICIONANDO O BOTÃO ADICIONAR
        JButton botao1 = new JButton();
        botao1.addActionListener( e -> new Popup_Adicionar_Produto(frameprincipal, this, estoque, predio, lado, nivel));
        botao1.setFocusable(false);
        botao1.setText("Adicionar");
        botao1.setBounds(105, 160, 100, 25);
        this.botaoAdicionar = botao1;

        //ADICIONANDO O BOTÃO MOVER
        JButton botao2 = new JButton();
        botao2.setFocusable(false);
        botao2.setText("Mover");
        botao2.setBounds(105, 190, 100, 25);
        this.botaoMover = botao2;

        //ADICIONANDO O BOTÃO REMOVER
        JButton botao3 = new JButton();
        botao3.addActionListener(e -> new Popup_Remover_Produto(frameprincipal, this, estoque, predio, lado, nivel));
        botao3.setFocusable(false);
        botao3.setText("Remover");
        botao3.setBounds(105, 220, 100, 25);
        this.botaoRemover = botao3;

        //ADICIONANDO O BOTÃO CANCELAR
        JButton botao4 = new JButton();
        botao4.setFocusable(false);
        botao4.setText("Cancelar");
        botao4.setBounds(105, 275, 100, 25);
        botao4.addActionListener(e ->this.frame.dispose());
        this.botaoCancelar = botao4;
        
        //ADICIONANDO AS LABELS DE TEXTO
        this.frame.add(this.textoPredio);
        this.frame.add(this.textoLado);
        this.frame.add(this.textoNivel);
        this.frame.add(this.textoProdutoCodigo);
        this.frame.add(this.textoValidade);
        this.frame.add(this.textoQuantidade);

        //ADICIONANDO AS LABELS DE INFORMAÇÃO DO TEXTO
        this.frame.add(this.informacaoPredio);
        this.frame.add(this.informacaoLado);
        this.frame.add(this.informacaoNivel);
        this.frame.add(this.informacaoProdutoCodigo);
        this.frame.add(this.informacaoValidade);
        this.frame.add(this.informacaoQuantidade);

        //ADICIONANDO OS BOTÕES
        this.frame.add(this.botaoAdicionar);
        this.frame.add(this.botaoMover);
        this.frame.add(this.botaoRemover);
        this.frame.add(this.botaoCancelar);

        this.atualizarInformacoes(estoque, predio, lado, nivel);
        this.frame.setVisible(true);
    }

    //ATUALIZANDO AS INFORMAÇÕES QUE ESTARÃO PRESENTES NO POPUP
    public void atualizarInformacoes(Estoque estoque, int predio, int lado, int nivel){
        //PEGANDO O CÓDIGO
        int codigoproduto = estoque.pegarCodigoProduto(predio, lado, nivel);
        if(codigoproduto == -1){
            this.informacaoProdutoCodigo.setText("");    
        }else{
            this.informacaoProdutoCodigo.setText("\t"+codigoproduto);
        }

        String data = "";
        int diaValidade = estoque.pegarDiaValidade(predio, lado, nivel);
        int mesValidade = estoque.pegarMesValidade(predio, lado, nivel);
        int anoValidade = estoque.pegarAnoValidade(predio, lado, nivel);
        if(diaValidade > 0 && mesValidade > 0 && anoValidade > 0){
            data = "\t"+diaValidade+" / "+mesValidade+" / "+anoValidade;
        }else if(diaValidade <= 0 && mesValidade > 0 && anoValidade > 0){
            data = "\t"+mesValidade+" /" +anoValidade;
        }else if(diaValidade <= 0 && mesValidade <= 0 && anoValidade > 0){
            data = "\t"+anoValidade;
        }

        System.out.println(data);
        this.informacaoValidade.setText(data);

        int quantidade = estoque.pegarQuantidade(predio, lado, nivel);
        if(quantidade > 0){
            this.informacaoQuantidade.setText("\t"+quantidade);
        }else this.informacaoQuantidade.setText("");

    }


    /*GETTERS AND SETTERS */
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JLabel getTextoPredio() {
        return textoPredio;
    }
    public void setTextoPredio(JLabel textoPredio) {
        this.textoPredio = textoPredio;
    }
    public JLabel getTextoLado() {
        return textoLado;
    }
    public void setTextoLado(JLabel textoLado) {
        this.textoLado = textoLado;
    }
    public JLabel getTextoNivel() {
        return textoNivel;
    }
    public void setTextoNivel(JLabel textoNivel) {
        this.textoNivel = textoNivel;
    }
    public JLabel getTextoProdutoCodigo() {
        return textoProdutoCodigo;
    }
    public void setTextoProdutoCodigo(JLabel textoProdutoCodigo) {
        this.textoProdutoCodigo = textoProdutoCodigo;
    }
    public JLabel getTextoQuantidade() {
        return textoQuantidade;
    }
    public void setTextoQuantidade(JLabel textoQuantidade) {
        this.textoQuantidade = textoQuantidade;
    }
    public JLabel getTextoValidade() {
        return textoValidade;
    }
    public void setTextoValidade(JLabel textoValidade) {
        this.textoValidade = textoValidade;
    }
    public JButton getBotaoAdicionar() {
        return botaoAdicionar;
    }
    public void setBotaoAdicionar(JButton botaoAdicionar) {
        this.botaoAdicionar = botaoAdicionar;
    }
    public JButton getBotaoRemover() {
        return botaoRemover;
    }
    public void setBotaoRemover(JButton botaoRemover) {
        this.botaoRemover = botaoRemover;
    }
    public JButton getBotaoMover() {
        return botaoMover;
    }
    public void setBotaoMover(JButton botaoMover) {
        this.botaoMover = botaoMover;
    }
    public JButton getBotaoCancelar() {
        return botaoCancelar;
    }
    public void setBotaoCancelar(JButton botaoCancelar) {
        this.botaoCancelar = botaoCancelar;
    }

    public JLabel getInformacaoPredio() {
        return informacaoPredio;
    }

    public void setInformacaoPredio(JLabel informacaoPredio) {
        this.informacaoPredio = informacaoPredio;
    }

    public JLabel getInformacaoLado() {
        return informacaoLado;
    }

    public void setInformacaoLado(JLabel informacaoLado) {
        this.informacaoLado = informacaoLado;
    }

    public JLabel getInformacaoNivel() {
        return informacaoNivel;
    }

    public void setInformacaoNivel(JLabel informacaoNivel) {
        this.informacaoNivel = informacaoNivel;
    }

    public JLabel getInformacaoProdutoCodigo() {
        return informacaoProdutoCodigo;
    }

    public void setInformacaoProdutoCodigo(JLabel informacaoProdutoCodigo) {
        this.informacaoProdutoCodigo = informacaoProdutoCodigo;
    }

    public JLabel getInformacaoQuantidade() {
        return informacaoQuantidade;
    }

    public void setInformacaoQuantidade(JLabel informacaoQuantidade) {
        this.informacaoQuantidade = informacaoQuantidade;
    }

    public JLabel getInformacaoValidade() {
        return informacaoValidade;
    }

    public void setInformacaoValidade(JLabel informacaoValidade) {
        this.informacaoValidade = informacaoValidade;
    }

    public int getPredio() {
        return predio;
    }

    public void setPredio(int predio) {
        this.predio = predio;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public static void main(String[] args) {
        int qtd_predios = 2;
        int qtd_lados = 2;
        int qtd_niveis = 2;
        int predio = 2; 
        Estoque estoque = new Estoque();
        estoque.iniciarEstoque(estoque, predio, qtd_lados, qtd_niveis);

        //Popup_Botoes_Predio_interface pop = new Popup_Botoes_Predio_interface(new JframePrincipal(qtd_lados, qtd_niveis, qtd_predios), estoque, 1, 1, 1);
        while(true){
            estoque.imprimirEstoque(estoque);
        }
    }
}
