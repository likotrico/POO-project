package usuarios;

public class Interno extends User implements Mudanca{
    private TipoInterno tipoInterno;

    /*GETTERS AND SETTERS */
    
    public TipoInterno getTipoInterno() {
        return tipoInterno;
    }

    public void setTipoInterno(TipoInterno tipoInterno) {
        this.tipoInterno = tipoInterno;
    }

    @Override
    public void mudarTipo() {
        if(this.tipoInterno == TipoInterno.ADM) this.tipoInterno = TipoInterno.VENDEDOR;
        if(this.tipoInterno == TipoInterno.VENDEDOR) this.tipoInterno = TipoInterno.ADM;
    }
}
