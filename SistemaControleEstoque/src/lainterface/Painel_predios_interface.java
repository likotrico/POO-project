package lainterface;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import estoque.Estoque;
import usuarios.Interno;

public class Painel_predios_interface extends JPanel{
    
    Celula_predio_interface[] predios;
    int qtd_predios;
    int qtd_niveis;
    int qtd_lados;

    public Painel_predios_interface(String nomeEstoque, Interno interno, JframePrincipal frameprincipal, Estoque estoque, int qtd_predios, int qtd_niveis, int qtd_lados, int largura_painel, int altura_painel){
        this.setBounds(0, 0, largura_painel, altura_painel);
        this.setPreferredSize(new Dimension(largura_painel, altura_painel));
        this.setLayout(null);

        this.setBackground(Color.yellow);

        this.qtd_predios = qtd_predios;
        this.qtd_niveis = qtd_niveis;
        this.qtd_lados = qtd_lados;

        this.criarPredios(nomeEstoque, interno, frameprincipal, estoque);
        this.setarPosicoesPredios();
        this.corrigirDimensoesPainel();
        this.inserirPrediosPainel();
    }

    //CRIANDO AS CELULAS DE CADA PRÉDIO
    public void criarPredios(String nomeEstoque, Interno interno, JframePrincipal frameprincipal, Estoque estoque){
        predios = new Celula_predio_interface[qtd_predios];
        int i;
        for(i = 0; i<qtd_predios; i++){
            predios[i] = new Celula_predio_interface(nomeEstoque, interno, frameprincipal, estoque, qtd_lados, qtd_niveis, i+1, 370, 370);
        }
    }

    public void setarPosicoesPredios(){
        int i;
        int x = 20, y = 20;
        int largura_celula = predios[0].getLargura();
        int altura_celula = predios[0].getAltura();
        boolean impar = true;
        for(i = 0; i<qtd_predios; i++){
            predios[i].alterarPosição(x, y);
            if(impar){
                x+=largura_celula+20;
                impar = false;
            }else{
                y+=altura_celula+20;
                x = 20;
                impar = true;
            }
        }
    }

    public void inserirPrediosPainel(){
        int i;
        for(i=0;i<qtd_predios;i++){
            this.add(predios[i]);
        }
    }

    public void corrigirDimensoesPainel(){
        int largura_celula = predios[0].getLargura();
        int altura_celula = predios[0].getAltura();
        int x, y;
        x =(3*20) + 2*largura_celula;
        y =(2*20)+(qtd_predios/2)*altura_celula+(((qtd_predios)/2)-1)*20;
        System.out.println(x);
        System.out.println(y);
        if(qtd_predios%2!=0) y+=altura_celula+20;
        this.setBounds(0, 0, x, y);
        this.setPreferredSize(new Dimension(x, y));
    }

    public void atualizarTextoBotoes(Estoque estoque){
        int i;
        for(i = 0; i < qtd_predios; i++){
            predios[i].atualizarTextoBotoes(estoque);
        }
    }

}
