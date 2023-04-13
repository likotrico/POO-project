import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        int menu = -1;
        int menuest = -1;
        int id, quantidade_produto, pred;
        while (menu != 0) {
            //System.out.println("1 - Criar Estoque\n0 - Sair");
            menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Estoque\n0 - Sair"));
            

            if (menu == 1) {
                Estoque estoque1 = new Estoque();
                estoque1.iniciarNovoEstoque(estoque1);
                while(true){
                    menuest = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Produto\n2 - Remover Produto\n3 - Imprimir Estoque\n0 - Sair"));
                    if(menuest == 1){
                        pred = Integer.parseInt(JOptionPane.showInputDialog("Em qual prédio deseja inserir?"));
                        id = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do produto"));
                        quantidade_produto = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
                        Produto produto1 = new Produto(id);
                        estoque1.inserirProdutoEstoque(produto1, pred, quantidade_produto);
                    }
                    else if(menuest == 2){
                        pred = Integer.parseInt(JOptionPane.showInputDialog("Em qual prédio deseja remover?"));
                        estoque1.removerProdutoEstoque(pred);
                    }
                    
                    else if(menuest == 3){
                        estoque1.imprimirEstoque(estoque1);
                    }
                    if(menuest == 0) break;
                }
            }
        }

        System.out.println("OK");

    }
}
