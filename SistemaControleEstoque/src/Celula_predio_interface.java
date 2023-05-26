import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Celula_predio_interface extends JPanel{

    private JPanel texto_principal; //O PAINEL QUE VAI TER O TEXTO DO PREDIO
    private JLabel label_principal;
    private JButton [][]lista_boteos;
    private int qtd_linhas;
    private int qtd_colunas;

    private int largura;
    private int altura;

    /*CONSTRUTOR */
    public Celula_predio_interface(int qtd_lados, int qtd_niveis, int predio, int largura, int altura){
        this.setPreferredSize(new Dimension(largura, altura)); //Criando o Jpainel com as dimensões
        this.setLayout(null); //Colocando o Layout da Panel
        this.setBounds(0, 0, largura, altura);
        this.largura = largura;
        this.altura = altura;
        this.setBackground(Color.green);
        this.qtd_linhas = qtd_niveis; 
        this.qtd_colunas = qtd_lados;

        this.label_principal = new JLabel(); //Criando o Label
        label_principal.setBackground(Color.red); //APENAS PARA SABER A REGIAL DA LABEL
        label_principal.setOpaque(true); //PODER VER A COR
        label_principal.setText("Prédio "+predio); //O TEXTO QUE VAI TER NA LABEL 
        label_principal.setHorizontalTextPosition(JLabel.CENTER); //COLOCANDO O TEXTO NO CENTRO DA HORIZONTAL
        
        criarListaBotoes(qtd_niveis, qtd_lados);

        texto_principal = new JPanel();
        texto_principal.add(label_principal);
        texto_principal.setBackground(Color.blue);
        texto_principal.setBounds(0,0,largura,50);
        this.add(texto_principal);
        this.criarBotoes();
    }

    public Celula_predio_interface(){

    }

    public void criarListaBotoes(int qtd_linhas, int qtd_colunas){
        this.lista_boteos = new JButton[qtd_linhas][qtd_colunas];
    }

    public void criarBotoes(){
        int i, j;
        int x = 0, y = 50;
        this.largura = x;
        this.altura = y;
        for(i=0; i<qtd_colunas; i++){ //LADO
            for(j=0; j<qtd_linhas; j++){ //NÍVEL
                JButton b = new JButton();
                b.setText(""+i+j);
                b.setBounds(x, y, 70, 70);
                b.setFocusable(false);
                this.add(b);
                y+=70;
                this.altura+=70;
                //System.out.println("y: "+y);
                //System.out.println("altura: "+this.altura);
                this.setPreferredSize(new Dimension((this.largura + x),(this.altura + y)));
            }
            x+=70;
            this.largura+=70;
            if(i!=qtd_colunas-1){
                y=50;
                this.altura=50;
            }/*else{
                this.largura+=0;
                this.altura+=0;
            }*/
        }
        //System.out.println("xf: "+x);
        //System.out.println("yf: "+y);
        this.setBounds(0,0,this.getLargura(), this.getAltura());
        texto_principal.setBounds(0,0,this.getLargura(),50);
    }

    //ALTERA A POSIÇÃO DE INICIO DE IMPRESSÃO
    public void alterarPosição(int x, int y){
        this.setBounds(x, y, largura, altura);
    }
    
    /*GETS ANDS SETS */

    public JLabel getLabel_principal() {
        return label_principal;
    }

    public void setLabel_principal(JLabel label_principal) {
        this.label_principal = label_principal;
    }

    public JButton[][] getLista_boteos() {
        return lista_boteos;
    }

    public void setLista_boteos(JButton[][] lista_boteos) {
        this.lista_boteos = lista_boteos;
    }

    public int getQtd_linhas() {
        return qtd_linhas;
    }

    public void setQtd_linhas(int qtd_linhas) {
        this.qtd_linhas = qtd_linhas;
    }

    public int getQtd_colunas() {
        return qtd_colunas;
    }

    public void setQtd_colunas(int qtd_colunas) {
        this.qtd_colunas = qtd_colunas;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}