package Prova1;

import java.time.LocalDateTime;

public class Enrollment {
    private static int id;
    private LocalDateTime enrollmentTime;
    private boolean concluded;

    private Student student;
    private Course[] courses;

    private static int counter;
    private int minutesPerWeek;

    public Enrollment(Student student) {
        if(student.getId() == null || student.getName() == null || student.getAdmissionDate() == null) {
            this.concluded = true;
            return;
        }

        id++;
        this.courses = new Course[10];
        this.student = student;
    }

    public boolean enroll(Course course) {
        if(concluded) return false;

        if(minutesPerWeek + course.getWeeklyDurationInMinutes() > 22 * 60) return false;

        for(int i = 0; i < counter; i++) {
            if(hasCollisionBetween(course, courses[i])) return false;
        }

        courses[counter++] = course;
        minutesPerWeek += course.getWeeklyDurationInMinutes();
        return true;
    }

    private static boolean hasCollisionBetween(Course course, Course current) {
        return !(course.getStartTime().isAfter(current.getEndTime()) || course.getEndTime().isBefore(current.getStartTime()));
    }

    public  void remove(Course course) {
        for(int i = 0; i < counter; i++) {
            if(courses[i].getId() == course.getId()) {
                courses[i] = courses[counter];
                courses[counter] = null;
                counter--;
                break;
            }
        }
    }

    public void conclude() {
        concluded = true;
        enrollmentTime = LocalDateTime.now();
    }

//    public String getStateAsString() {
//       Fazer um resturn de uma única string
//        """
//
//                """
//    }

    public int getId() {
        return id;
    }

    public LocalDateTime getEnrollmentTime() {
        return enrollmentTime;
    }

    public boolean getConclusionState() {
        return concluded;
    }

    public Student getStudent() {
        return student;
    }

    //Embora a classe seja mutável, ela não pode ser alterada após a
    //conclusão da matrícula.
    //Precisa de setters?
}
