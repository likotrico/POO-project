package usuarios;

import java.util.ArrayList;

import estoque.Produto;

public class Externo extends User{
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
    
}
