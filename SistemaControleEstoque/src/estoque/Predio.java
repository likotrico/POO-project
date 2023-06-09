package estoque;

public class Predio {
    
    private int quant_lado; //QUANTIDADE DE LADOS QUE UM PRÉDIO DO ESTOQUE VAI POSSUIR
    private int quant_nivel; //QUANTIDADE DE NÍVEIS QUE UM ESTOQUE VAI POSSUIR
    private Espaco[][] espaco; //MATRIZ CONTENDO OS ESPAÇOS PRESENTES EM UM PRÉDIO

    //MÉTODO CONSTRUTOR DA CLASSE
    public Predio(int lado, int nivel){
        this.quant_lado = lado;
        this.quant_nivel = nivel;
    }

    //INSTANCIANDO A QUANTIDADE DE ESPACOES EM UM PRÉDIO
    public void criarEspacos(){
        this.espaco = new Espaco[this.quant_lado][this.quant_nivel];
    }

    //CHAMA A FUNÇÃO PARA CRIAR UM NOVO PRÉDIO
    public void iniciarNovoPredio(int quant_lado, int quant_nivel){
        setLado(quant_lado);
        setNivel(quant_nivel);
        this.criarEspacos();
        for(int i = 0; i < quant_lado; i++){
            for(int j = 0; j < quant_nivel; j++){
                espaco[i][j] = new Espaco();
            }
        }
    }

    //IMPRIME TODOS OS PRODUTOS EM UM PRÉDIO


    //INSERIR PRODUTO EM UM ESPAÇO
    public void inserir(Produto produto, int lado, int nivel, int qtd){
        try{
            espaco[lado][nivel].inserir(produto, qtd);
            //System.out.println("INSERIU PRÉDIO");
        }catch(Exception e){
            System.out.println("Problema ao inserir o Produto em um Espaço");
        }
    }

    public int pegarCodigoProduto(int lado, int nivel){
        return espaco[lado][nivel].pegarCodigoProduto();
    }

    public int pegarDiaValidade(int lado, int nivel){
        return espaco[lado][nivel].pegarDiaValidade();
    }

    public int pegarMesValidade(int lado, int nivel){
        return espaco[lado][nivel].pegarMesValidade();
    }

    public int pegarAnoValidade(int lado, int nivel){
        return espaco[lado][nivel].pegarAnoValidade();
    }

    public int pegarQuantidade(int lado, int nivel){
        return espaco[lado][nivel].getQuantidade();
    }

    //VERIFICA SE EXISTE PRODUTO NO ESPAÇO INDICADO
    public boolean existeProduto(int lado, int nivel){
        if(espaco[lado][nivel].getProduto() == null) return false;
        else return true;
    }
 
    //INCREMENTAR QUANTIDADE ESPAÇO
    public void incrementarQuantidade(int lado, int nivel, int qtd){
        espaco[lado][nivel].setQuantidade(espaco[lado][nivel].getQuantidade() + qtd);
    }
    //SUBTRAIR QUANTIDADE ESPAÇO
    public void subtrairQuantidade(int lado_part, int nivel_part ,int qtd){
        espaco[lado_part][nivel_part].subtrairQuantidade(qtd);
    }

    //REMOVER PRODUTO EM UM ESPAÇO
    public void remover(int lado, int nivel, int qtd){
        try{
            espaco[lado][nivel].remover(qtd);
        }catch(Exception e){
            System.out.println("Problema ao remover o produto!");
        }
    }

    public void removerTudo(int lado, int nivel){
        try{
            espaco[lado][nivel].removerTudo();
        }catch(Exception e){
            System.out.println("Problema ao remover o produto!");
        }
    }

    public int verificarValidade(int lado, int nivel, int dia, int mes, int ano){
        //System.out.println("ENTROU NO PRÉDIO");
        return espaco[lado][nivel].verificarValidade(dia, mes, ano);
    }

    //GETTERS AND SETTERS
    public int getLado() {
        return this.quant_lado;
    }
    public void setLado(int lado) {
        this.quant_lado = lado;
    }
    public int getNivel() {
        return this.quant_nivel;
    }
    public void setNivel(int nivel) {
        this.quant_nivel = nivel;
    }
    
}
