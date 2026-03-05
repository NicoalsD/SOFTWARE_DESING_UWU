import java.util.List;

public class Fabrica {
    private List<Planta> plantas;

    public Fabrica(List<Planta> plantas) {
        this.plantas = plantas;
    }

    public void setPlantas(List<Planta> plantas) {
        this.plantas = plantas;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }
}
