package Prova1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        Student elisa = new Student("sc3050742", "Elisa Eimy Miura", LocalDate.of(2025, 02, 20));
        Student Kayk = new Student("sc3000000", "Kayk", LocalDate.of(2023, 02, 20));

        System.out.println(elisa.getSemester());
        System.out.println(Kayk.getSemester());

        Course POO = new Course(LocalTime.of(8, 0), LocalTime.of(11, 30), "Programação Orientada a Objetos", "12345", "Lucas", DayOfWeek.TUESDAY, Course.Room.C104);
        System.out.println(POO.getStateAsString());
        System.out.println(POO.getWeeklyDurationInMinutes());

        Course BDD = new Course(LocalTime.of(10, 0), LocalTime.of(11, 30), "Banco de Dados 1", "678910", "Fábio", DayOfWeek.THURSDAY, Course.Room.C102);
        System.out.println(BDD.getStateAsString());
        System.out.println(BDD.getWeeklyDurationInMinutes());
    }
}
