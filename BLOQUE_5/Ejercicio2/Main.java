package BLOQUE_5.Ejercicio2;

//  no quiero ver el color, que las figuras se puedan mover

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        
        
        Circle circle = new Circle(2.5, "blue", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimetro: " + circle.getPerimeter());
        
        Rectangle rectangle = new Rectangle(4.0, 6.0, "green", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());
        
        Square square = new Square(3.0, "yellow", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimetro: " + square.getPerimeter());
        
        
        square.setLength(5.0);
        System.out.println("Square despues de setLength(5.0): " + square);

        shape.mover();
        circle.mover();
        rectangle.mover();
        square.mover();
    }
}
