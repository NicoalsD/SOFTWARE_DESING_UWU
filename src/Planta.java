public class Planta {
    private TipoLlanta llanta;
    private MaterialChasis chasis;
    private Colores color;

    public Planta(TipoLlanta llanta, MaterialChasis chasis, Colores color) {
        this.llanta = llanta;
        this.chasis = chasis;
        this.color = color;
    }

    public Carro fabricar() {
        return new Carro(this.color, this.chasis, this.llanta);
    }

    public TipoLlanta getLlanta() {
        return llanta;
    }

    public MaterialChasis getChasis() {
        return chasis;
    }

    public Colores getColores() {
        return color;
    }

    public void setLlanta(TipoLlanta llanta) {
        this.llanta = llanta;
    }

    public void setChasis(MaterialChasis chasis) {
        this.chasis = chasis;
    }
}
