public class Espaco {

    private int lado; //O LADO QUE O PRODUTO ESTÁ OCUPANDO
    private int nivel; //O NÍVEL QUE O PRODUTO ESTÁ OCUPANDO
    private Produto produto; //INFORMAÇÕES DO PRODUTO
    private int quantidade; //QUANTIDADE DO PRODUTO PRESENTE NO ESPAÇO

    //INSERINDO UM PRODUTO EM UM ESPAÇO
    public void inserirProdutoEspaco(Produto produto, int quantidade){
        setProduto(produto);
        setQuantidade(quantidade);
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
