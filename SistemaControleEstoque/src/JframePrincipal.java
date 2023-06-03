import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import estoque.Estoque;

public class JframePrincipal {
    
    private JFrame frame;
    private JScrollPane scrollPanePredios;
    private JLabel textoNotificacoes;
    private JLabel notificacoes;
    private JLabel saudacao;
    private JButton botaosair;
    private JButton botaoCadastrarUsuarios;
    private JButton botaoFornecedores;
    private JButton botaoClientes;
    private JButton botaoFiltros;

    private Painel_predios_interface teste;

    /*CONSTRUTOR DA JFRAME*/
    
    //remover dps
    public JframePrincipal(){

    }

    /*public JframePrincipal(JframePrincipal frameprincipal, Estoque estoque, int qtd_lados, int qtd_niveis, int qtd_predios){
        
        int altura = 900;
        int largura = 600;
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(altura, largura);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame = frame;
        
        Painel_predios_interface p = new Painel_predios_interface(frameprincipal, estoque, qtd_predios, qtd_niveis, qtd_lados, largura, altura);

        //CRIANDO O JSCROLLPANE DOS PRÉDIOS
        JScrollPane scroll = new JScrollPane(p);
        scroll.setBounds(290, 50, 500, 450);
        this.scrollPanePredios = scroll;

        //CRIANDO A JLABEL DAS NOTIFICAÇÕES
        JLabel label = new JLabel();
        label.setBackground(Color.BLUE);
        label.setBounds(80, 85, 200, 415);
        label.setOpaque(true);
        this.notificacoes = label;

        //CRIANDO A JLABEL DE SAUDAÇÃO
        JLabel label1 = new JLabel();
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);
        //FONTE DA LABEL
        Font fonte = new Font("Olá, 'NOME DO USUÁRIO' 'TIPO DE INTERNO'", Font.BOLD, 21);
        label1.setFont(fonte);
        label1.setText(fonte.getName());
        label1.setBounds(80, 510, 710, 30);
        this.saudacao = label1;

        //CRIANDO A JLABEL DO TEXTO NOTIFICAÇÕES
        JLabel label2 = new JLabel();
        label2.setBackground(Color.GRAY);
        label2.setOpaque(true);
        Font fonte1 = new Font("Notificações", Font.BOLD, 15);
        label2.setFont(fonte1);
        label2.setText(fonte1.getName());
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setBounds(80, 50, 200, 30);
        this.textoNotificacoes = label2;

        //CRIANDO O BOTÃO DE SAIR
        JButton botao = new JButton();
        botao.setFocusable(false);
        botao.setText("Sair");
        botao.setBounds(80, 10, 70, 30);
        this.botaosair = botao;

        //CRIANDO O BOTÃO DE CADASTRAR NOVOS USUÁRIOS
        JButton botao1 = new JButton();
        botao1.setFocusable(false);
        botao1.setText("Novo Usuário");
        botao1.setBounds(160, 10, 120, 30);
        this.botaoCadastrarUsuarios = botao1;

        //CRIANDO O BOTÃO DE FORNECEDORES
        JButton botao2 = new JButton();
        botao2.setFocusable(false);
        botao2.setText("Fornecedores");
        botao2.setBounds(290, 10, 120, 30);
        this.botaoFornecedores = botao2;

        //CRIANDO O BOTÃO DE CLIENTES
        JButton botao3 = new JButton();
        botao3.setFocusable(false);
        botao3.setText("Clientes");
        botao3.setBounds(420, 10, 120, 30);
        this.botaoClientes = botao3;

        //CRIANDO O BOTÃO DE FILTROS
        JButton botao4 = new JButton();
        botao4.setFocusable(false);
        botao4.setText("Filtrar");
        botao4.setBounds(550, 10, 80, 30);
        this.botaoFiltros = botao4;
        
        //ADICIONANDO SCROLLPANE        
        this.frame.add(this.scrollPanePredios);
        //ADICIONANDO LABELS
        this.frame.add(this.notificacoes);
        this.frame.add(this.saudacao);
        this.frame.add(this.textoNotificacoes);
        //ADICIONANDO BOTÕES
        this.frame.add(this.botaosair);
        this.frame.add(this.botaoCadastrarUsuarios);
        this.frame.add(this.botaoFornecedores);
        this.frame.add(this.botaoClientes);
        this.frame.add(this.botaoFiltros);
        
        frame.setVisible(true);
    }*/

    public void iniciarFrame(JframePrincipal frameprincipal, Estoque estoque, int qtd_lados, int qtd_niveis, int qtd_predios){
        
        try{int altura = 900;
        int largura = 600;
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(altura, largura);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame = frame;
        
        Painel_predios_interface p = new Painel_predios_interface(frameprincipal, estoque, qtd_predios, qtd_niveis, qtd_lados, largura, altura);
        this.teste = p;
        //CRIANDO O JSCROLLPANE DOS PRÉDIOS
        JScrollPane scroll = new JScrollPane(teste);
        scroll.setBounds(290, 50, 500, 450);
        this.scrollPanePredios = scroll;

        //CRIANDO A JLABEL DAS NOTIFICAÇÕES
        JLabel label = new JLabel();
        label.setBackground(Color.BLUE);
        label.setBounds(80, 85, 200, 415);
        label.setOpaque(true);
        this.notificacoes = label;

        //CRIANDO A JLABEL DE SAUDAÇÃO
        JLabel label1 = new JLabel();
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);
        //FONTE DA LABEL
        Font fonte = new Font("Olá, 'NOME DO USUÁRIO' 'TIPO DE INTERNO'", Font.BOLD, 21);
        label1.setFont(fonte);
        label1.setText(fonte.getName());
        label1.setBounds(80, 510, 710, 30);
        this.saudacao = label1;

        //CRIANDO A JLABEL DO TEXTO NOTIFICAÇÕES
        JLabel label2 = new JLabel();
        label2.setBackground(Color.GRAY);
        label2.setOpaque(true);
        Font fonte1 = new Font("Notificações", Font.BOLD, 15);
        label2.setFont(fonte1);
        label2.setText(fonte1.getName());
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setBounds(80, 50, 200, 30);
        this.textoNotificacoes = label2;

        //CRIANDO O BOTÃO DE SAIR
        JButton botao = new JButton();
        botao.setFocusable(false);
        botao.setText("Sair");
        botao.setBounds(80, 10, 70, 30);
        this.botaosair = botao;

        //CRIANDO O BOTÃO DE CADASTRAR NOVOS USUÁRIOS
        JButton botao1 = new JButton();
        botao1.setFocusable(false);
        botao1.setText("Novo Usuário");
        botao1.setBounds(160, 10, 120, 30);
        this.botaoCadastrarUsuarios = botao1;

        //CRIANDO O BOTÃO DE FORNECEDORES
        JButton botao2 = new JButton();
        botao2.setFocusable(false);
        botao2.setText("Fornecedores");
        botao2.setBounds(290, 10, 120, 30);
        this.botaoFornecedores = botao2;

        //CRIANDO O BOTÃO DE CLIENTES
        JButton botao3 = new JButton();
        botao3.setFocusable(false);
        botao3.setText("Clientes");
        botao3.setBounds(420, 10, 120, 30);
        this.botaoClientes = botao3;

        //CRIANDO O BOTÃO DE FILTROS
        JButton botao4 = new JButton();
        botao4.setFocusable(false);
        botao4.setText("Filtrar");
        botao4.setBounds(550, 10, 80, 30);
        this.botaoFiltros = botao4;
        
        //ADICIONANDO SCROLLPANE        
        this.frame.add(this.scrollPanePredios);
        //ADICIONANDO LABELS
        this.frame.add(this.notificacoes);
        this.frame.add(this.saudacao);
        this.frame.add(this.textoNotificacoes);
        //ADICIONANDO BOTÕES
        this.frame.add(this.botaosair);
        this.frame.add(this.botaoCadastrarUsuarios);
        this.frame.add(this.botaoFornecedores);
        this.frame.add(this.botaoClientes);
        this.frame.add(this.botaoFiltros);
        
        frame.setVisible(true);
        }catch(Exception e){
            System.out.println("Problema ao carregar a tela principal!");
        }
    }

    public void atualizarOsBotoes(Estoque estoque){
        this.teste.atualizarTextoBotoes(estoque);
    }

    /*GETTERS AND SETTERS */
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JScrollPane getScrollPanePredios() {
        return scrollPanePredios;
    }

    public void setScrollPanePredios(JScrollPane scrollPanePredios) {
        this.scrollPanePredios = scrollPanePredios;
    }

    public JLabel getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(JLabel notificacoes) {
        this.notificacoes = notificacoes;
    }

    public JButton getBotaosair() {
        return botaosair;
    }

    public void setBotaosair(JButton botaosair) {
        this.botaosair = botaosair;
    }

    public JButton getBotaoCadastrarUsuarios() {
        return botaoCadastrarUsuarios;
    }

    public void setBotaoCadastrarUsuarios(JButton botaoCadastrarUsuarios) {
        this.botaoCadastrarUsuarios = botaoCadastrarUsuarios;
    }

    public JButton getBotaoClientes() {
        return botaoClientes;
    }

    public void setBotaoClientes(JButton botaoClientes) {
        this.botaoClientes = botaoClientes;
    }

    public JButton getBotaoFornecedores() {
        return botaoFornecedores;
    }

    public void setBotaoFornecedores(JButton botaoFornecedores) {
        this.botaoFornecedores = botaoFornecedores;
    }

    public JButton getBotaoFiltros() {
        return botaoFiltros;
    }

    public void setBotaoFiltros(JButton botaoFiltros) {
        this.botaoFiltros = botaoFiltros;
    }

    public JLabel getSaudacao() {
        return saudacao;
    }

    public void setSaudacao(JLabel saudacao) {
        this.saudacao = saudacao;
    }

    public JLabel getTextoNotificacoes() {
        return textoNotificacoes;
    }

    public void setTextoNotificacoes(JLabel textoNotificacoes) {
        this.textoNotificacoes = textoNotificacoes;
    }

    /*MAIN */
    public static void main(String[] args) {
        int qtd_lados = 2;
        int qtd_niveis = 6;
        int qtd_predios = 32;
        Estoque estoque = new Estoque();
        estoque.iniciarEstoque(estoque, qtd_predios, qtd_lados, qtd_niveis);
        JframePrincipal framePrincipal = new JframePrincipal();
        framePrincipal.iniciarFrame(framePrincipal, estoque, qtd_lados, qtd_niveis, qtd_predios);
       
    }
}
