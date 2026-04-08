package BLOQUE_5.Ejercicio1;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Person {
    private String name;
    private String address;
    private final LocalDate dateOfBirth;


    public Person(String name, String address, LocalDate dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public int calculateAge(){
        var fecha = Period.between(dateOfBirth,LocalDate.now());
        return fecha.getYears();


    }
    @Override
    public String toString() {
        return "Person name is = " + getName() + " ,w address = " + getAddress() + " Edad = " + calculateAge();
    }
}
//fecha  de nacimiento pero que en vez de fecha de edad
