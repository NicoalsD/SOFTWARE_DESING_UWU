public class Carro {
    private Colores color;
    private Chasis chasis;
    private Llanta llanta;

    public Carro(Colores color, Chasis chasis, Llanta llanta) {
        this.color = color;
        this.chasis = chasis;
        this.llanta = llanta;
    }

    public Colores getColor() {
        return this.color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Chasis getChasis() {
        return this.chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Llanta getLlanta() {
        return this.llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    @Override
    public String toString() {
        return "Carro{color= "+this.color+", chasis= "+this.chasis+", llanta= "+this.llanta+"}";
    }
}
