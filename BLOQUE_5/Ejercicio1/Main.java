package BLOQUE_5.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Guayaquil");
        System.out.println(person);

        Student student = new Student("Ana", "Quito", "Software", 3, 1500.0);
        System.out.println(student);

        Staff staff = new Staff("Luis", "Cuenca", "UCE", 950.0);
        System.out.println(staff);
    }
}
