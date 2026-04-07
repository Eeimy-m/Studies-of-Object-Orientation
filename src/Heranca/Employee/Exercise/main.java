package Heranca.Employee.Exercise;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        FullTimeEmployee elisa = new FullTimeEmployee(3000, "123", "Elisa Eimy Miura", "Software Engeneer", LocalDate.of(2025, 9, 17));

        System.out.println(elisa.getId());
        System.out.println(elisa.getName());
        System.out.println(elisa.getJobTitle());
        System.out.println(elisa.getDateOfEmployment());
        System.out.println(elisa.getMonthlySalary());

        PerHourEmployee sara = new PerHourEmployee(100, 300, "456", "Sara", "frontEnd developer", LocalDate.of(2026, 3, 11));
        System.out.println(sara.getWorkedHour());
        System.out.println(sara.getHourlyRate());
        System.out.println(sara.getId());
        System.out.println(sara.getName());
        System.out.println(sara.getJobTitle());
        System.out.println(sara.getDateOfEmployment());
        System.out.println(sara.salary());
    }
}
