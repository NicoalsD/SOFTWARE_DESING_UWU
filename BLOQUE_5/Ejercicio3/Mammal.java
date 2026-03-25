package BLOQUE_5.Ejercicio3;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, Raza raza) {
        super(name, raza);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

