package BLOQUE_5.Ejercicio2;

public class Shape {
    private boolean filled;

    public Shape() {
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.filled = filled;
    }

    public void mover() {
        System.out.println("La figura se movió");
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[filled=" + isFilled() + "]";
    }
}
