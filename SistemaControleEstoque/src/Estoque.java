public class Estoque {

    private Predio[] estoque;

    //INSTANCIANDO A QUANTIDADE DE PRÉDIOS
    public void criarPredios(int num){
        this.estoque = new Predio[num];
    }


    //GETTERS AND SETTERS

    public Predio[] getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Predio[] estoque) {
        this.estoque = estoque;
    }
    
}
