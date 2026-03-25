package BLOQUE_5.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Happy la gata", Raza.FINO);
        Dog dog1 = new Dog("Nicolas", Raza.CALLEJERO);
        Dog dog2 = new Dog("Toby", Raza.CALLEJERO);


        System.out.println(cat);
        System.out.println(dog1);


        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}