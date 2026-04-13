package Prova1;

import java.time.LocalDate;

public class Student {
    private String id;
    private String name;
    private LocalDate admissionDate;
    private Enrollment[] enrollments;

    public Student(String id, String name, LocalDate admissionDate) {
//        char[] idCharArray = id.toCharArray();
//        char[] SC = (id.substring(0,2)).toCharArray();
//        int numbersOfId = Integer.parseInt(id.substring(2,8));

//        if(idCharArray.length != 9) {
//            return;
//        }

        this.id = id;
        this.name = name;
        this.admissionDate = admissionDate;
    }

    public int getSemester() {
        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();
        int yearsOfDifference = currentYear - admissionDate.getYear();

        if(currentMonth > 6) {
            currentMonth = 2;
        }
        else {
            currentMonth = 1;
        }

        System.out.println("Current year: " + currentYear);
        System.out.println("Current month: " + currentMonth);
        System.out.println("Years difference: " + yearsOfDifference);

        if(yearsOfDifference > 0) {
            return (yearsOfDifference * 2) + currentMonth;
        }

        return currentMonth;
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
