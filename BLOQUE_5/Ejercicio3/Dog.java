package BLOQUE_5.Ejercicio3;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Auuuuuuu");
    }

    public Dog(String name, Raza raza) {
        super(name, raza);
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}