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
            return produto.getCodigo();
        }else return -1;
        
    }

    public int pegarDiaValidade(){
        if(produto != null){
            return produto.getDia_val();
        }else return -1;
    }

    public int pegarMesValidade(){
        if(produto != null){
            return produto.getMes_val();
        }else return -1;
    }

    public int pegarAnoValidade(){
        if(produto != null){
            return produto.getAno_val();
        }else return -1;
    }

    //REMOVENDO UM PRODUTO EM UM ESPAÇO
    public void remover(int qtd){
        if(this.quantidade - qtd > 0){
            if(this.produto != null){
                this.quantidade = this.quantidade - qtd;
            }else{
                System.out.println("Não há produto no local indicado!");
            }
        }else if(this.quantidade - qtd == 0){
            this.removerTudo();
        }else{
            System.out.println("Quantidade a ser removida é superior a quantidade presente!");
        }
    }

    public void removerTudo(){
        this.quantidade = 0;
        this.produto = null;
    }

    //SUBTRAIR QUANTIDADE
    public void subtrairQuantidade(int sub){
        if(getQuantidade() - sub < 0) return;
        else this.setQuantidade((this.getQuantidade() - sub));
    }

    public int verificarValidade(int dia, int mes, int ano){
        System.out.println("ENTROU ESPAÇO");
        if(produto != null){
            System.out.println("O PRODUTO NÃO É NULO");
            if(produto.getCodigo() > 0){
                System.out.println("PRODUTO MAIOR Q 0");
                if(ano <= produto.getAno_val()){
                    System.out.println("ANO PASSOU");
                    if(mes <= produto.getMes_val()){
                        if(dia <= produto.getDia_val()){
                            return 1;
                        }else return 0;
                    }else return 0;
                }else return 0;  
            }return -2;
        }
        return -1;
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
