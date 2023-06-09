package estoque;
public class Informacoes {
    private int predio;
    private int lado; 
    private int nivel;
    private Produto produto;

    public Informacoes(int predio, int lado, int nivel, Produto produto) {
        this.predio = predio;
        this.lado = lado;
        this.nivel = nivel;
        this.produto = produto;
    }

    public int getProdutoAno(){
        return produto.getAno_val();
    }

    public int getProdutoMes(){
        return produto.getMes_val();
    }

    public int getProdutoDia(){
        return produto.getDia_val();
    }

    public int getPredio() {
        return predio;
    }
    public void setPredio(int predio) {
        this.predio = predio;
    }
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
