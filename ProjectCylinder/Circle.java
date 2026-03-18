package ProjectCylinder;

public class Circle {
    private double radius;
    private String color;

    // Constructores
    public Circle() {
        this.radius = 0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
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
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Datos del Circulo, tiene un radio de: " + this.radius + " y tiene un area de: " + this.getArea() + ". El circulo tiene un color " + this.color;
    }

    
}
