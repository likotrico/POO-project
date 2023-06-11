package lainterface;

import java.awt.Dimension;
import javax.swing.JPanel;

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
        //this.setBackground(Color.PINK);
        
    }

    public void adicionarNotificacao(String mensagem){
        Celula_notificacoes a = new Celula_notificacoes(0, this.ultimo_y, this.largura_padrao_notificacao, this.altura_padrao_notificacao, mensagem);
        this.add(a);
        this.setPreferredSize(new Dimension(this.largura, this.altura+this.ultimo_y));
        this.ultimo_y += altura_padrao_notificacao;
        System.out.println(this.ultimo_y);
        System.out.println(this.getPreferredSize());
        
    }

}
