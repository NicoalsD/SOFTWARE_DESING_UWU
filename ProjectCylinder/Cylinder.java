package ProjectCylinder;

public class Cylinder extends Circle {
    private double height;

    // Constructores
    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, Color color) {
        super(radius, color);
        this.height = height;
    }

    // Métodos
    // height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //
    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + " El cilindro tiene un alto de: " + getHeight() + " y un volumen de: " + getVolume();
    }
}
