package BLOQUE_5.Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Patio Bonito", LocalDate.of(1980, 3, 26));
        System.out.println(person);

        Student student = new Student("Ana", "Quito", "Software", LocalDate.of(2001 ,9, 11 ), 3, 1500.0);
        System.out.println(student);

        Staff staff = new Staff("Camilo", "Buenos Aires", LocalDate.of(1600 ,7 ,20), "UCE", 950.0);
        System.out.println(staff);


    }
}
