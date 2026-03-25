package ProjectCylinder;
// el color sea una enumeración
public class Circle {
    private double radius;
    private Color color;

    // Constructores
    public Circle() {
        this.radius = 0;
        this.color = Color.ROJO;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    // Métodos
    // Radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //Color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Datos del Circulo: tiene un radio de: " + getRadius() + " y tiene un area de: " + getArea() + ". El circulo tiene un color " + getColor();
    }

    
}
