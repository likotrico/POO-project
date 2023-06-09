package lainterface;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import estoque.Estoque;
import estoque.Informacoes;
import estoque.Produto;
import login_cadastro.Clientes;
import login_cadastro.Fornecedores;
import usuarios.Interno;
import usuarios.TipoInterno;

public class JframePrincipal {
    
    private JFrame frame;
    private JScrollPane scrollPanePredios;
    private JScrollPane scrollNotificacoes;
    private JLabel textoNotificacoes;
    private JLabel notificacoes;
    private JLabel saudacao;
    private JButton botaosair;
    private JButton botaoCadastrarUsuarios;
    private JButton botaoFornecedores;
    private JButton botaoClientes;
    private JButton botaoFiltros;
    private Painel_notificacoes painel_notificacoes;

    private Painel_predios_interface teste;
    
    private ArrayList<Aux> conjuntoNotificado;

    private class Aux{
        private int predio;
        private int lado;
        private int nivel;

        private Aux(int predio, int lado, int nivel){
            this.predio = predio;
            this.lado = lado;
            this.nivel = nivel;
        }
    }
    /*CONSTRUTOR DA JFRAME*/
    public JframePrincipal(){

    }

    public void iniciarFrame(String nomeEstoque, Interno interno, JframePrincipal frameprincipal, Estoque estoque, int qtd_lados, int qtd_niveis, int qtd_predios){
        
        try{int altura = 900;
        int largura = 600;
        this.conjuntoNotificado = new ArrayList<Aux>();

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(altura, largura);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame = frame;
        
        Painel_predios_interface p = new Painel_predios_interface(nomeEstoque, interno, frameprincipal, estoque, qtd_predios, qtd_niveis, qtd_lados, largura, altura);
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
        
        //CRIANDO O SCROLL PANE COM AS NOTIFICAÇÕES
        Painel_notificacoes a = new Painel_notificacoes(201, 415, 200, 30, 0);
        this.painel_notificacoes = a;
        JScrollPane scroll2 = new JScrollPane(this.painel_notificacoes);
        scroll2.setBackground(Color.PINK);
        scroll2.setOpaque(true);
        scroll2.setBounds(80, 85, 200, 415);
        scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.scrollNotificacoes = scroll2;
        

        //CRIANDO A JLABEL DE SAUDAÇÃO
        JLabel label1 = new JLabel();
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);
        //FONTE DA LABEL
        Font fonte = new Font("Olá, "+interno.getNome()+" ("+interno.getTipoInterno()+")", Font.BOLD, 21);
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
        botao.addActionListener(e -> this.sair(interno));
        botao.setFocusable(false);
        botao.setText("Sair");
        botao.setBounds(80, 10, 70, 30);
        this.botaosair = botao;

        //CRIANDO O BOTÃO DE CADASTRAR NOVOS USUÁRIOS
        JButton botao1 = new JButton();
        botao1.setFocusable(false);
        botao1.setText("N.F.E.");
        botao1.setBounds(160, 10, 120, 30);
        this.botaoCadastrarUsuarios = botao1;
        //VERIFICANDO SE O USUÁRIO TEM PERMISSÃO PARA ACESSAR O CONTEÚDO DESSE BOTÃO
        if(interno.getTipoInterno() == TipoInterno.ADM) botao1.setEnabled(true);
        else botao1.setEnabled(false);
        
        
        //CRIANDO O BOTÃO DE FORNECEDORES
        JButton botao2 = new JButton();
        new Fornecedores();
        botao2.addActionListener(e -> Fornecedores.main(null));
        botao2.setFocusable(false);
        botao2.setText("Fornecedores");
        botao2.setBounds(290, 10, 120, 30);
        this.botaoFornecedores = botao2;

        //CRIANDO O BOTÃO DE CLIENTES
        JButton botao3 = new JButton();
        new Clientes();
        botao3.addActionListener(e -> Clientes.main(null));
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
        this.frame.add(this.scrollNotificacoes);
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
        
        this.verificarValidadeEstoque(estoque);
        frame.setVisible(true);

        
        
        }catch(Exception e){
            e.getStackTrace();
            System.out.println("Problema ao carregar a tela principal!"+e.getMessage());
        }
    }

    public void atualizarOsBotoes(Estoque estoque){
        this.teste.atualizarTextoBotoes(estoque);
        //this.ordenarData(1014, estoque);
    }

    public boolean jaNotificado(int predio, int lado, int nivel){
        for (Aux eleAux : this.conjuntoNotificado) {
            if(eleAux.predio == predio){
                if(eleAux.lado == lado){
                    if(eleAux.nivel == nivel) return true;
                }
            }
        }
        return false;
    }

    public void verificarValidadeEstoque(Estoque estoque){
       int qtd_predios = estoque.pegarNumeroPredios();
       int qtd_lados = estoque.pegarNumeroLados();
       int qtd_niveis = estoque.pegarNumeroNiveis();
       qtd_predios -= 1;
       qtd_lados -= 1;
       qtd_niveis -= 1; 
       Calendar calendar = Calendar.getInstance();
       
       int dia = calendar.get(Calendar.DAY_OF_MONTH);
       int mes = calendar.get(Calendar.MONTH) + 1;
       int ano = calendar.get(Calendar.YEAR);

       for(int i = 0; i <= qtd_predios; i++){
        for(int j = 0; j <= qtd_lados; j++){
            for(int k = 0; k <= qtd_niveis; k++){
                int a  = estoque.verificarValidade(i, j, k, dia, mes, ano);
                if(a == 0){
                    Aux aux = new Aux(i, j, k);
                    if(!(jaNotificado(i, j, k))){
                        this.conjuntoNotificado.add(aux);
                        this.painel_notificacoes.adicionarNotificacao("Prédio: "+(i+1)+"/ Lado: "+(j+1)+" / Nível: "+(k+1));
                        this.painel_notificacoes.adicionarNotificacao("Produto Vencido!");
                        this.scrollNotificacoes.setVisible(false);
                        this.scrollNotificacoes.setVisible(true);
                    }
                }
                //System.out.println("Prédio: "+i+" Lado: "+j+" Nível: "+k+" Val: "+a);
            }
        }
       }
    }

    public void ordenarData(int codigo, Estoque estoque){
        int qtd_predios = estoque.pegarNumeroPredios();
        int qtd_lados = estoque.pegarNumeroLados();
        int qtd_niveis = estoque.pegarNumeroNiveis();
        int a;
        qtd_predios -= 1;
        qtd_lados -= 1;
        qtd_niveis -= 1; 
        ArrayList<Informacoes> array = new ArrayList<>();
        //COLOCANDO TODOS OS PRODUTOS COM O CÓDIGO NO ARRAYLIST
        for(int i = 0; i <= qtd_predios; i++){
            for(int j = 0; j <= qtd_lados; j++){
                for(int k = 0; k <= qtd_niveis; k++){
                    a = estoque.pegarCodigoProduto(i, j, k);
                    if(a == codigo){
                        Informacoes inf_aux = new Informacoes(i, j, k, new Produto(codigo, estoque.pegarDiaValidade(i, j, k), estoque.pegarMesValidade(i, j, k), estoque.pegarAnoValidade(i, j, k)));
                        array.add(inf_aux);
                    }
                }
            }
        }
        //ORDENAR POR DATA
        int count = 0;
        while(count != array.size()-1){
            count = 0;
            //System.out.println(array.size()-1);
            //System.out.println("DENTRO DO WHILE");
            for(int i = 0; i < array.size() - 1; i++){
                //System.out.println("loop: "+i);
                if(i != array.size()-1){
                    if(array.get(i).getProdutoAno() > array.get(i+1).getProdutoAno()){
                        //System.out.println("i: "+array.get(i).getProdutoAno());
                        //System.out.println("i+1: "+array.get(i+1).getProdutoAno());
                        Informacoes inf_aux = array.get(i);
                        //System.out.println("inf: "+inf_aux.getProdutoAno());
                        array.set(i, array.get(i+1));
                        array.set(i+1, inf_aux);
                    }
                    else if(array.get(i).getProdutoAno() == array.get(i+1).getProdutoAno()){
                        if(array.get(i).getProdutoMes() > array.get(i+1).getProdutoMes()){
                            Informacoes inf_aux = array.get(i);
                            array.set(i, array.get(i+1));
                            array.set(i+1, inf_aux);
                        }
                        else if(array.get(i).getProdutoMes() == array.get(i+1).getProdutoMes()){
                            if(array.get(i).getProdutoDia() > array.get(i+1).getProdutoDia()){
                                Informacoes inf_aux = array.get(i);
                                array.set(i, array.get(i+1));
                                array.set(i+1, inf_aux);
                            }else count += 1;
                        }
                        else count += 1;
                    }
                    else count += 1;
                }
            }
            //System.out.println("Count: "+count);
        }
        for (Informacoes informacoes : array) {
            System.out.println(informacoes.getProdutoAno());
        }
    }

    public void sair(Interno interno){
        this.frame.dispose();
        new MenuInicial(interno);
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
        int qtd_niveis = 2;
        int qtd_predios = 2;
        Estoque estoque = new Estoque();
        estoque.iniciarEstoque(estoque, qtd_predios, qtd_lados, qtd_niveis);
        /*tirar linha abaixo */
        Produto p = new Produto(1014);
        p.setDia_val(31);
        p.setMes_val(5);
        p.setAno_val(2023);
        estoque.inserir(p, 0, 0, 0, 10);
        JframePrincipal framePrincipal = new JframePrincipal();
        Interno interno = new Interno();
        interno.setNome("likotrico");
        interno.setTipoInterno(TipoInterno.ADM);
        String nomeEstoque = "a";
        
        framePrincipal.iniciarFrame(nomeEstoque, interno, framePrincipal ,estoque, qtd_lados, qtd_niveis, qtd_predios);
       
    }
}
