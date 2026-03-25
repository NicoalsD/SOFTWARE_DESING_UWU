package BLOQUE_5.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Happy la gata");
        Dog dog1 = new Dog("Nicolas");
        Dog dog2 = new Dog("Toby");


        System.out.println(cat);
        System.out.println(dog1);


        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}