public class Predio {
    
    private int quant_lado; //QUANTIDADE DE LADOS QUE UM PRÉDIO DO ESTOQUE VAI POSSUIR
    private int quant_nivel; //QUANTIDADE DE NÍVEIS QUE UM ESTOQUE VAI POSSUIR
    private Espaco[][] espaco; //

    //MÉTODO CONSTRUTOR DA CLASSE
    public Predio(int lado, int nivel){
        this.quant_lado = lado;
        this.quant_nivel = nivel;
    }

    //INSTANCIANDO A QUANTIDADE DE ESPACOES EM UM PRÉDIO
    public void criarEspacos(){
        this.espaco = new Espaco[this.quant_lado][this.quant_nivel];
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
