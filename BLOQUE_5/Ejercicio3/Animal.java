package BLOQUE_5.Ejercicio3;

public class Animal {
    private String name;
    private Raza raza;
    
    public Animal(String name) {
        this(name, null);
    }

    public Animal(String name, Raza raza) {
        this.name = name;
        this.raza = raza;
    }

    public String getName() {
        return name;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal[name=\"" + name + "\"] de Raza " + raza;
    }
}


