package lainterface;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Painel_notificacoes extends JPanel{
    
    private int ultimo_y;
    private int largura_padrao_notificacao;
    private int altura_padrao_notificacao;
    private int largura;
    private int altura;

    public Painel_notificacoes(int largura, int altura, int largura_padrao_notificacao, int altura_padrao_notificacao, int ultimo_y){
        this.setLayout(null);
        this.largura = largura;
        this.altura = altura_padrao_notificacao;
        this.largura_padrao_notificacao = largura_padrao_notificacao;
        this.altura_padrao_notificacao = altura_padrao_notificacao;
        this.ultimo_y = ultimo_y;

        this.setBounds(0, 0, largura, altura);
        this.setPreferredSize(new Dimension(largura, altura));
        this.setBackground(Color.PINK);
        
    }

    public void adicionarNotificacao(String mensagem){
        Celula_notificacoes a = new Celula_notificacoes(0, this.ultimo_y, this.largura_padrao_notificacao, this.altura_padrao_notificacao, mensagem);
        this.add(a);
        this.setPreferredSize(new Dimension(this.largura, this.altura+this.ultimo_y));
        this.ultimo_y += altura_padrao_notificacao;
        System.out.println(this.ultimo_y);
        System.out.println(this.getPreferredSize());
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int altura = 400;
        int largura = 400;
        int largura_padrao_notificacao = 400;
        int altura_padrao_notificacao = 30;

        
        Painel_notificacoes a = new Painel_notificacoes(largura, altura, largura_padrao_notificacao, altura_padrao_notificacao, 0);
        a.adicionarNotificacao("OLA");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("TOOL_TIP_TEXT_KEY");
        a.adicionarNotificacao("3");

        JScrollPane scroll = new JScrollPane(a);
        scroll.setBounds(0, 0, largura, altura);

        frame.add(scroll);
        frame.setVisible(true);
    }

}
