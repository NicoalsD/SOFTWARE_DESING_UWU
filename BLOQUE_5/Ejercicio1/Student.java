package BLOQUE_5.Ejercicio1;

import java.time.LocalDate;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, LocalDate dateOfBirth, int year, double fee) {
        super(name, address, dateOfBirth);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() + " ,program  " + getProgram() + " ,year  " + getYear() + " ,fee " + getFee();
    }
}
