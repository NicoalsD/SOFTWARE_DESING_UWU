package ProjectCylinder;

public class Main {
    public static void main(String[] args) {
        // Creación de un ciruclo
        Circle miCirculo = new Circle();
        System.out.println(miCirculo);

        // Creacíón de un cilindro
        Cylinder miCilindro = new Cylinder(10, 20, "Violeta");
        System.out.println(miCilindro);
    }
}
