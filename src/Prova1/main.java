package Prova1;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Student elisa = new Student("sc3050742", "Elisa Eimy Miura", LocalDate.of(2025, 02, 20));
        Student Kayk = new Student("sc3000000", "Kayk", LocalDate.of(2023, 02, 20));

        System.out.println(elisa.getSemester());
        System.out.println(Kayk.getSemester());
    }
}
