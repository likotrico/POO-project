package estoque;

public class Espaco {

    private int lado; //O LADO QUE O PRODUTO ESTÁ OCUPANDO
    private int nivel; //O NÍVEL QUE O PRODUTO ESTÁ OCUPANDO
    private Produto produto; //INFORMAÇÕES DO PRODUTO
    private int quantidade; //QUANTIDADE DO PRODUTO PRESENTE NO ESPAÇO

    public Espaco(){
        this.quantidade = 0;
        this.produto = null;
    }

    //INSERINDO UM PRODUTO EM UM ESPAÇO
    public void inserirProdutoEspaco(Produto produto, int quantidade){
        setProduto(produto);
        setQuantidade(quantidade);
        System.out.println("INSERIU ESPAÇO");
    }

    public int pegarCodigoProduto(){
        if(produto != null){
            return produto.pegarCodigoProduto();
        }else return -1;
        
    }

    //REMOVENDO UM PRODUTO EM UM ESPAÇO
    public void remover(){
        if(this.produto != null){
            this.produto = null;
            this.quantidade = 0;
        }else{
            System.out.println("Não há produto no local indicado!");
        }
    }

    //SUBTRAIR QUANTIDADE
    public void subtrairQuantidade(int sub){
        if(getQuantidade() - sub < 0) return;
        else this.setQuantidade((this.getQuantidade() - sub));
    }

    //GETTERS AND SETTERS
    public int getLado() {
        return this.lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    public int getNivel() {
        return this.nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public Produto getProduto() {
        return this.produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
