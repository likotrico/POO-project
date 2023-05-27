import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JframePrincipal {
    
    private JFrame frame;
    private JScrollPane scrollPanePredios;

    /*CONSTRUTOR DA JFRAME*/
    public JframePrincipal(int qtd_lados, int qtd_niveis, int qtd_predios){
        
        int altura = 900;
        int largura = 600;
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(altura, largura);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Painel_predios_interface p = new Painel_predios_interface(qtd_predios, qtd_niveis, qtd_lados, largura, altura);

        JScrollPane scroll = new JScrollPane(p);
        scroll.setBounds(350, 50, 450, 450);

        this.scrollPanePredios = scroll;
        this.frame = frame;
        this.frame.add(this.scrollPanePredios);
        frame.setVisible(true);
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

    /*MAIN */
    public static void main(String[] args) {
        int qtd_lados = 2;
        int qtd_niveis = 6;
        int qtd_predios = 32;
        JframePrincipal framePrincipal = new JframePrincipal(qtd_lados, qtd_niveis, qtd_predios);
    }
}
