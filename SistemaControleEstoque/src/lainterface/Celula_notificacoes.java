package lainterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Celula_notificacoes extends JLabel{
    
    private String texto;

    public Celula_notificacoes(int ultimo_x, int ultimo_y, int largura_padrao, int altura_padrao, String mensagem){
        this.setLayout(null);
        this.texto = mensagem;
        this.setText(this.texto);
        Border border = BorderFactory.createLineBorder(Color.black, 1);
        Font font = new Font(mensagem, Font.BOLD, 10);
        this.setFont(font);
        this.setBorder(border);
        this.setBounds(ultimo_x, ultimo_y, largura_padrao, altura_padrao);
        this.setPreferredSize(new Dimension(largura_padrao, altura_padrao));
    }

    

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int ultimo_x = 0;
        int ultimo_y = 0;
        int largura_padrao = 400;
        int altura_padrao = 30;
        
        Celula_notificacoes a = new Celula_notificacoes(ultimo_x, ultimo_y, largura_padrao, altura_padrao, "OLÁ");
        ultimo_y += altura_padrao;
        Celula_notificacoes b = new Celula_notificacoes(ultimo_x, ultimo_y, largura_padrao, altura_padrao, "XD");

        frame.add(a);
        frame.add(b);
        frame.setVisible(true);
    }
}
