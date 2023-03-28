import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int menu = -1;
        Scanner sc = new Scanner(System.in);
        while(menu != 0){
            System.out.println("0 - Sair");
            menu = sc.nextInt();
            

            if(menu == 0) break;
        }



        int num_predios = 32;
        int lados = 2;
        int niveis = 6;
        Predio pred[];
        pred = new Predio[1];
        pred[0] = new Predio(lados, niveis);

        Estoque estoque1 = new Estoque();
        estoque1.criarPredios(num_predios);



        Predio predio1 = new Predio(lados, niveis);
        predio1.criarEspacos();
        pred[0] = predio1;

        estoque1.setEstoque(pred);
        //estoque1.setEstoque(predio1);
        System.out.println("OK");



    }
}
