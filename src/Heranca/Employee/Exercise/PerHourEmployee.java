package Heranca.Employee.Exercise;

public final class PerHourEmployee extends Employee{
    private double hourlyRate;
    private int workedHour;

    public PerHourEmployee(double hourlyRate, int workedHour) {
        this.hourlyRate = hourlyRate;
        this.workedHour = workedHour;
    }

    @Override
    public double salary() {
        return hourlyRate * workedHour;
    }
}
