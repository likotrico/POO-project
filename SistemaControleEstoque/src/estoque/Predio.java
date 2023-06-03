package estoque;

import javax.swing.JOptionPane;

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
    public void imprimirPredio(Predio pred){
        for(int i = 0; i < quant_lado; i++){
            for(int j = 0; j < quant_nivel; j++){
                if(pred.espaco[i][j].getProduto() != null){
                    Produto prod = pred.espaco[i][j].getProduto();
                    System.out.println("ID: "+prod.getCodigo()+" | Quantidade:"+pred.espaco[i][j].getQuantidade());
                    System.out.println("Lado " + i+ "|"+ "Nivel " + j);
                }
            }
        }
    }

    //VERIFICA SE EXISTE PRODUTO NO ESPAÇO INDICADO
    public boolean existeProduto(int lado, int nivel){
        if(espaco[lado][nivel].getProduto() == null) return false;
        else return true;
    }

    //VERIFICA  SE É O MESMO PRODUTO
    public boolean mesmoProduto(int lado, int nivel, Produto produto){
        if(espaco[lado][nivel].getProduto().getCodigo() == produto.getCodigo()) return true;
        else return false;
    }

    //INCREMENTAR QUANTIDADE ESPAÇO
    public void incrementarQuantidade(int lado, int nivel, int qtd){
        espaco[lado][nivel].setQuantidade(espaco[lado][nivel].getQuantidade() + qtd);
    }

    //INSERIR PRODUTO EM UM ESPAÇO
    public void inserirProdutoPredio(Produto produto, int qtd){
        while(true){
            int side = Integer.parseInt(JOptionPane.showInputDialog("Em qual lado deseja inserir?"));
            if(side > this.quant_lado - 1 || side <= 0){ //VALIDANDO O LADO
                System.out.println("Lado inexistente");
            }else{
                int level = Integer.parseInt(JOptionPane.showInputDialog("Em qual nível deseja inserir?"));
                if(level > this.quant_nivel - 1 || level <= 0){//VALIDANDO O NÍVEL
                    System.out.println("Nível inexistente");
                }else{
                    espaco[side][level].inserirProdutoEspaco(produto, qtd); 
                    break;
                }
            }
        }
    }

    public void inserir(Produto produto, int lado, int nivel, int qtd){
        try{
            espaco[lado][nivel].inserirProdutoEspaco(produto, qtd);
            System.out.println("INSERIU PRÉDIO");
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

    //MOVER PRODUTO DE UM ESPACO PARA OUTRO
    public void subtrairPredio(int lado_part, int nivel_part, int qtd, Produto produto){
        if(produto.getCodigo() == espaco[lado_part][nivel_part].getProduto().getCodigo()) espaco[lado_part][nivel_part].subtrairQuantidade(qtd);
        else System.out.println("O produto no local não é o mesmo!");
    }


    //REMOVER PRODUTO EM UM ESPAÇO
    public void removerProdutoPredio(int qtd){
        while(true){
            int side = Integer.parseInt(JOptionPane.showInputDialog("Em qual lado deseja remover?"));
            if(side > this.quant_lado - 1 || side <= 0){ //VALIDANDO O LADO
                System.out.println("Lado inexistente");
            }else{
                int level = Integer.parseInt(JOptionPane.showInputDialog("Em qual nível deseja remover?"));
                if(level > this.quant_nivel - 1 || level <= 0){//VALIDANDO O NÍVEL
                    System.out.println("Nível inexistente");
                }else{
                    espaco[side][level].remover(qtd);
                    break;
                }
            }
        }
    }

    public void remover(int lado, int nivel, int qtd){
        try{
            espaco[lado][nivel].remover(qtd);
        }catch(Exception e){
            System.out.println("Problema ao remover o produto!");
        }
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
