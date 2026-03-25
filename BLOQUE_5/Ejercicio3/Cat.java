package BLOQUE_5.Ejercicio3;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Raza raza) {
        super(name, raza);
    }


    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}