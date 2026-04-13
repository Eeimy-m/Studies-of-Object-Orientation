package Prova1;

import java.time.LocalDateTime;

public class Enrollment {
    private int id;
    private LocalDateTime enrollmentTime;
    private boolean concluded;

    public Enrollment(int id, LocalDateTime enrollmentTime, boolean concluded) {
        this.id = id;
        this.enrollmentTime = enrollmentTime;
    }

    public boolean enroll(Course course) {

    }

    public  void remove(Course course) {

    }

    public void conclude() {

    }

    public String getStateAsString() {

    }

    public int getId() {
        return id;
    }

    public LocalDateTime getEnrollmentTime() {
        return enrollmentTime;
    }

    public boolean getConclusionState() {
        return concluded;
    }
}
