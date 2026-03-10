public class Carro {
    private Colores color;
    private MaterialChasis chasis;
    private TipoLlanta llanta;

    public Carro(Colores color, MaterialChasis chasis, TipoLlanta llanta) {
        this.color = color;
        this.chasis = chasis;
        this.llanta = llanta;
    }

    public Colores getColor() {
        return this.color;
    }

    public  void setColor(Colores color) {
        this.color = color;
    }

    public MaterialChasis getChasis() {
        return this.chasis;
    }

    public void setChasis(MaterialChasis chasis) {
        this.chasis = chasis;
    }

    public TipoLlanta getLlanta() {
        return this.llanta;
    }

    public void setLlanta(TipoLlanta llanta) {
        this.llanta = llanta;
    }

    @Override
    public String toString() {
        return "Carro{color= "+this.color+", MaterialChasis= "+this.chasis+", TipoLLanta= "+this.llanta+"}";
    };
}
