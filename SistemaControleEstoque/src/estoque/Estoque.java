package estoque;

public class Estoque{

    private Predio[] estoque;

    // INSTANCIANDO A QUANTIDADE DE PRÉDIOS
    public void criarPredios(int num) {
        this.estoque = new Predio[num];
    }

    // FUNÇÃO INSTACIA OS ESPAÇOS NA MEMÓRIA DO ESTOQUE
    public void iniciarEstoque(Estoque est, int pred, int lado, int nivel) {
        est.criarPredios(pred);
        for (int i = 0; i < pred; i++) {
            System.out.println(i);
            est.estoque[i] = new Predio(lado, nivel);
            est.estoque[i].iniciarNovoPredio(lado, nivel);
        }
    }

    //INSERIR NOVO PRODUTO NO ESTOQUE
    public void inserir(Produto produto, int pred, int lado, int nivel, int qtd){
        if(pred >= estoque.length){ //VERIFICANDO SE O PRÉDIO DIGITADO FOI VÁLIDO
        }else{
            estoque[pred].inserir(produto, lado, nivel, qtd);
        }
    }


    //FUNÇÕES PARA PEGAR INFORMAÇÕES DO PRODUTO
    public int pegarCodigoProduto(int predio, int lado, int nivel){
        return estoque[predio].pegarCodigoProduto(lado, nivel);
    }

    public int pegarDiaValidade(int predio, int lado, int nivel){
        return estoque[predio].pegarDiaValidade(lado, nivel);
    }

    public int pegarMesValidade(int predio, int lado, int nivel){
        return estoque[predio].pegarMesValidade(lado, nivel);
    }

    public int pegarAnoValidade(int predio, int lado, int nivel){
        return estoque[predio].pegarAnoValidade(lado, nivel);
    }

    public int pegarQuantidade(int predio, int lado, int nivel){
        return estoque[predio].pegarQuantidade(lado, nivel);
    }

    //MOVER UM PRODUTO EXISTENTE NO ESTOQUE PARA OUTRO ESPAÇO
    public boolean mesmoProduto(int predio_part, int lado_part, int nivel_part, /*int dia_part, int mes_part, int ano_part,*/int predio_dest, int lado_dest, int nivel_dest /*, int dia_dest, int mes_dest, int ano_dest*/){
        if(estoque[predio_part].pegarCodigoProduto(lado_part, nivel_part) == estoque[predio_dest].pegarCodigoProduto(lado_dest, nivel_dest)){
            if(estoque[predio_part].pegarDiaValidade(lado_part, nivel_part) == estoque[predio_dest].pegarDiaValidade(lado_dest, nivel_dest)){
                if(estoque[predio_part].pegarMesValidade(lado_part, nivel_part) == estoque[predio_dest].pegarMesValidade(lado_dest, nivel_dest)){
                    if(estoque[predio_part].pegarAnoValidade(lado_part, nivel_part) == estoque[predio_dest].pegarAnoValidade(lado_dest, nivel_dest)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean existeProduto(int predio, int lado, int nivel){
        return estoque[predio].existeProduto(lado, nivel);
    }

    public void subtrairQuantidade(int predio_part, int lado_part, int nivel_part, int qtd){
        estoque[predio_part].subtrairQuantidade(lado_part, nivel_part, qtd);
    }

    public void incrementarQuantidade(int predio_dest, int lado_dest, int nivel_dest, int qtd){
        estoque[predio_dest].incrementarQuantidade(lado_dest, nivel_dest, qtd);
    }

    //REMOVER UM PRODUTO NO ESTOQUE
    public void remover(int predio, int lado, int nivel, int qtd){
        try{
            estoque[predio].remover(lado, nivel, qtd);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Problema ao remover o produto!");
        }
    }

    public void removerTudo(int predio, int lado, int nivel){
        try{
            estoque[predio].removerTudo(lado, nivel);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Problema ao remover o produto!");
        }
    }

    public int verificarValidade(int predio, int lado, int nivel, int dia, int mes, int ano){
        return estoque[predio].verificarValidade(lado, nivel, dia, mes, ano);
    }

    public int pegarNumeroPredios(){
        int count = 0;
        for (Predio predio : estoque) {
            count++;
        }
        return count;
    }

    public int pegarNumeroLados(){
        return estoque[0].getLado();
    }

    public int pegarNumeroNiveis(){
        return estoque[0].getNivel();
    }

    // GETTERS AND SETTERS

    public Predio[] getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Predio[] estoque) {
        this.estoque = estoque;
    }

}
