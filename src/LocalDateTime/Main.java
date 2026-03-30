package LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Meeting meeting1 = new Meeting(
                "Reunião 1 lab 105",
                LocalTime.of(10, 0),
                LocalTime.of(11,0)
        );

        Meeting meeting2 = new Meeting(
                "Reunião 2 lab 200",
                LocalTime.of(10, 30),
                LocalTime.of(11,30)
        );

        Schedule schedule1 = new Schedule(
                LocalDate.of(2026, 3, 30),
                LocalTime.of(8, 0),
                LocalTime.of(16, 0)
        );

        schedule1.addMeeting(meeting1);
        schedule1.addMeeting(meeting2);
        schedule1.removeMeeting(meeting1);
    }
}
