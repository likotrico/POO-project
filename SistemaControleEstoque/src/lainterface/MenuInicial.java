package lainterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;

public class MenuInicial {

    private JFrame frame; //OK
    private JButton botaoCriarEstoque; //OK
    private JButton botaoCarregarEstoque; //OK
    private JButton botaoSair; //OK
 
    public MenuInicial(){
        //CRIANDO JFRAME
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(300, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame = frame;

        //ADICIONANDO O BOTÃO CRIAR ESTOQUE
        JButton botao1 = new JButton();
        botao1.setFocusable(false);
        botao1.addActionListener(e -> new MenuInicial_CriarEstoque());
        Font fonte1 = new Font("Criar Estoque", Font.BOLD, 17);
        botao1.setText(fonte1.getName());
        botao1.setBounds(75, 62, 150, 40);
        this.botaoCriarEstoque = botao1;

        //ADICIONANDO O BOTÃO CARREGAR ESTOQUE
        JButton botao2 = new JButton();
        botao2.setFocusable(false);
        Font fonte2 = new Font("Carregar Estoque", Font.BOLD, 17);
        botao2.setText(fonte2.getName());
        botao2.setBounds(75, 117, 150, 40);
        this.botaoCarregarEstoque = botao2;

        //ADICIONANDO O BOTÃO SAIR
        JButton botao3 = new JButton();
        botao3.addActionListener(e ->System.exit(0));
        botao3.setFocusable(false);
        Font fonte3 = new Font("Sair", Font.BOLD, 17);
        botao3.setText(fonte3.getName());
        botao3.setBounds(75, 172, 150, 40);
        this.botaoSair = botao3;
        

        this.frame.add(this.botaoCriarEstoque);
        this.frame.add(this.botaoCarregarEstoque);
        this.frame.add(this.botaoSair);

        this.frame.setVisible(true);

    }

    public static void main(String[] args) {
        MenuInicial menu = new MenuInicial();
    }

    



    public JFrame getFrame() {
        return frame;
    }



    public void setFrame(JFrame frame) {
        this.frame = frame;
    }



    public JButton getBotaoCriarEstoque() {
        return botaoCriarEstoque;
    }



    public void setBotaoCriarEstoque(JButton botaoCriarEstoque) {
        this.botaoCriarEstoque = botaoCriarEstoque;
    }



    public JButton getBotaoCarregarEstoque() {
        return botaoCarregarEstoque;
    }



    public void setBotaoCarregarEstoque(JButton botaoCarregarEstoque) {
        this.botaoCarregarEstoque = botaoCarregarEstoque;
    }



    public JButton getBotaoSair() {
        return botaoSair;
    }



    public void setBotaoSair(JButton botaoSair) {
        this.botaoSair = botaoSair;
    }

    
}
