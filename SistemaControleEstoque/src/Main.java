import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        int menu = 1;
        while (menu != 0) {
            //System.out.println("1 - Criar Estoque\n0 - Sair");
            menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Estoque\n0 - Sair"));
            

            if (menu == 1) {
                Estoque estoque1 = new Estoque();
                estoque1.iniciarNovoEstoque(estoque1);
            }
        }

        /*
         * int num_predios = 32;
         * int lados = 2;
         * int niveis = 6;
         * 
         * 
         * 
         * Estoque estoque1 = new Estoque();
         * 
         * estoque1.criarPredios(num_predios);
         * 
         * 
         * 
         * Predio predio1 = new Predio(lados, niveis);
         * predio1.criarEspacos();
         * pred[0] = predio1;
         * 
         * estoque1.setEstoque(pred);
         */
        // estoque1.setEstoque(predio1);

        System.out.println("OK");

    }
}
