import javax.swing.JOptionPane;

public class Estoque {

    private Predio[] estoque;

    // INSTANCIANDO A QUANTIDADE DE PRÉDIOS
    public void criarPredios(int num) {
        this.estoque = new Predio[num];
    }

    // FUNÇÃO PARA PEDIR AO USUÁRIO A QUANTOS PRÉDIOS, LADOS E NÍVEIS DESEJA NO SEU
    // DEPÓSITO
    // FUNÇÃO TAMBÉM JÁ INSTACIA OS ESPAÇOS NA MEMÓRIA DO ESTOQUE
    public void iniciarNovoEstoque(Estoque est) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Quantos Prédios você deseja possuir?"));
        est.criarPredios(num);
        int quant_lado, quant_nivel;
        quant_lado = Integer.parseInt(JOptionPane.showInputDialog("Quantos lados você deseja?"));
        quant_nivel = Integer.parseInt(JOptionPane.showInputDialog("Quantos níveis você deseja?"));
        for (int i = 0; i < num; i++) {
            System.out.println(i);
            est.estoque[i] = new Predio(quant_lado, quant_nivel);
            est.estoque[i].iniciarNovoPredio(quant_lado, quant_nivel);
        }
    }

    //INSERIR NOVO PRODUTOR NO ESTOQUE
    public void inserirProdutoEstoque(Produto produto, int pred, int qtd){
        if(pred >= estoque.length){ //VERIFICANDO SE O PRÉDIO DIGITADO FOI VÁLIDO
            System.out.println("Prédio inexistente");
        }else{
            estoque[pred].inserirProdutoPredio(produto, qtd);
        }
    }

    //FUNÇÃO PARA IMPRIMIR TODOS OS PRODUTOS DENTRO DO ESTOQUE
    public void imprimirEstoque(Estoque est){
        for (int i = 0; i < this.estoque.length; i++){
            if(est.estoque[i] != null){
                est.estoque[i].imprimirPredio(est.estoque[i]);
            }
        }
    }

    // GETTERS AND SETTERS

    public Predio[] getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Predio[] estoque) {
        this.estoque = estoque;
    }

}
