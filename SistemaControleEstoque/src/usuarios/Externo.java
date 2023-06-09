package usuarios;

import java.util.ArrayList;

import estoque.Produto;

public class Externo extends User implements Mudanca{
    private ArrayList<Produto> produtos;
    private String telefone;
    private String codProduto;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    private TipoExterno tipoExterno;

    public TipoExterno getTipoExterno() {
        return tipoExterno;
    }

    public void setTipoExterno(TipoExterno tipoExterno) {
        this.tipoExterno = tipoExterno;
    }

    public ArrayList<Produto> getProdutos_adquiridosOUvendidos() {
        return produtos;
    }

    public void setProdutos_adquiridosOUvendidos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void mudarTipo() {
        if(this.tipoExterno == TipoExterno.CLIENTE) this.tipoExterno = TipoExterno.FORNECEDOR;
        if(this.tipoExterno == TipoExterno.FORNECEDOR) this.tipoExterno = TipoExterno.CLIENTE;
    }
    
}
