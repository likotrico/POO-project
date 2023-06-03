package estoque;

public class Produto {

    // -1 para tratar os casos de quando não tivermos informações do produto
    private int codigo = -1;
    private double valor_venda = -1;
    private int ano_val = -1;
    private int mes_val = -1;
    private int dia_val = -1;

    public Produto(int codigo){
        this.codigo = codigo;
    }

    public int pegarCodigoProduto(){
        return this.codigo;
    }

    public int pegarDiaValidade(){
        return this.dia_val;
    }


    /*GETTERS AND SETTERS */

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno_val() {
        return ano_val;
    }

    public void setAno_val(int ano_val) {
        this.ano_val = ano_val;
    }

    public int getMes_val() {
        return mes_val;
    }

    public void setMes_val(int mes_val) {
        this.mes_val = mes_val;
    }

    public int getDia_val() {
        return dia_val;
    }

    public void setDia_val(int dia_val) {
        this.dia_val = dia_val;
    }

    
}
