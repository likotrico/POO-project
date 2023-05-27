package usuarios;

import java.util.ArrayList;

import estoque.Produto;
import usuarios.TipoExterno;
import usuarios.User;

public class Externo extends User{
    private ArrayList<Produto> produtos;
    private ArrayList<String> informacoes;
    private TipoExterno tipoExterno;

    public TipoExterno getTipoExterno() {
        return tipoExterno;
    }

    public void setTipoExterno(TipoExterno tipoExterno) {
        this.tipoExterno = tipoExterno;
    }

    public ArrayList<String> getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(ArrayList<String> informacoes) {
        this.informacoes = informacoes;
    }

    public ArrayList<Produto> getProdutos_adquiridosOUvendidos() {
        return produtos;
    }

    public void setProdutos_adquiridosOUvendidos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
}
