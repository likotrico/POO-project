package estoque;

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

    public void iniciarEstoque(Estoque est, int pred, int lado, int nivel) {
        //int num = Integer.parseInt(JOptionPane.showInputDialog("Quantos Prédios você deseja possuir?"));
        est.criarPredios(pred);
        //int quant_lado, quant_nivel;
        //quant_lado = Integer.parseInt(JOptionPane.showInputDialog("Quantos lados você deseja?"));
        //quant_nivel = Integer.parseInt(JOptionPane.showInputDialog("Quantos níveis você deseja?"));
        for (int i = 0; i < pred; i++) {
            System.out.println(i);
            est.estoque[i] = new Predio(lado, nivel);
            est.estoque[i].iniciarNovoPredio(lado, nivel);
        }
    }

    //INSERIR NOVO PRODUTO NO ESTOQUE
    public void inserirProdutoEstoque(Produto produto, int pred, int qtd){
        if(pred >= estoque.length){ //VERIFICANDO SE O PRÉDIO DIGITADO FOI VÁLIDO
            System.out.println("Prédio inexistente");
        }else{
            estoque[pred].inserirProdutoPredio(produto, qtd);
        }
    }

    public void inserir(Produto produto, int pred, int lado, int nivel, int qtd){
        //System.out.println("LADO:"+lado);
        //System.out.println("NÍVEL:"+nivel);
        if(pred >= estoque.length){ //VERIFICANDO SE O PRÉDIO DIGITADO FOI VÁLIDO
            System.out.println("Prédio inexistente");
        }else{
            estoque[pred].inserir(produto, lado, nivel, qtd);
            System.out.println("INSERIU ESTOQUE");
        }
        
    }

    public int pegarCodigoProduto(int predio, int lado, int nivel){
        //System.out.println("Lado:"+lado);
        //System.out.println("Nível:"+nivel);
        return estoque[predio].pegarCodigoProduto(lado, nivel);
    }

    //MOVER UM PRODUTO EXISTENTE NO ESTOQUE PARA OUTRO ESPAÇO
    public void moverProdutoEstoque(int pred_part, int lado_part, int nivel_part, int qtd, int pred_dest, int lado_dest, int nivel_dest, Produto produto){
        estoque[pred_part].subtrairPredio(lado_part, nivel_part, qtd, produto);
        if(estoque[pred_dest].existeProduto(lado_dest, nivel_dest)){
            if(estoque[pred_dest].mesmoProduto(lado_dest, nivel_dest, produto)){
                estoque[pred_dest].incrementarQuantidade(lado_dest, nivel_dest, qtd);
            }
        }else{
            inserirProdutoEstoque(produto, pred_dest, qtd);
        }
    }

    //REMOVER UM PRODUTO NO ESTOQUE
    public void removerProdutoEstoque(int pred){
        if(pred >= estoque.length){ //VERIFICANDO SE O PRÉDIO DIGITADO FOI VÁLIDO
            System.out.println("Prédio inexistente");
        }else{
            estoque[pred].removerProdutoPredio();
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
