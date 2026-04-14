package Prova1;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String id;
    private String name;
    private LocalDate admissionDate;

    public Student(String id, String name, LocalDate admissionDate) {


        this.id = id;
        this.name = name;
        this.admissionDate = admissionDate;
    }

    private boolean isValidId(String id) {
        String idToUpperCase = id.toUpperCase();

        if(idToUpperCase.length() != 9) return false;
        if(!idToUpperCase.startsWith("SC")) return false;

        char lastChar = idToUpperCase.charAt(8);
        if(lastChar != 'X' || !Character.isDigit(lastChar)) return false;

        for(int i = 2; i < 9; i++) {
            if(!Character.isDigit(idToUpperCase.charAt(i))) return false;
        }
        return true;
    }

    public int getSemester() {
        return (int) (Period.between(admissionDate, LocalDate.now()).toTotalMonths() / 6) + 1;
    }

    public String getStateAsString() {
        return String.format("id: %s | Name: %s | Admission date: %s", id, name, admissionDate);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }
}
