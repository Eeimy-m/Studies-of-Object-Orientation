package Heranca.Employee.Exercise;

import java.time.LocalDate;

public final class PerHourEmployee extends Employee{
    private double hourlyRate;
    private int workedHour;

    public PerHourEmployee(double hourlyRate, int workedHour, String id, String name, String jobTitle, LocalDate dateOfEmployment) {
        super(id, name, jobTitle, dateOfEmployment);
        this.hourlyRate = hourlyRate;
        this.workedHour = workedHour;
    }

    @Override
    public double salary() {
        return hourlyRate * workedHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getWorkedHour() {
        return workedHour;
    }
}
