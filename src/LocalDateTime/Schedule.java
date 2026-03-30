package LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;

    private Meeting[] meetings = new Meeting[2];
    private int cont;

    public Schedule(LocalDate day, LocalTime startTime, LocalTime endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void addMeeting(Meeting meeting) {
        if(cont != 0) {
            for(int i = 0; i < cont; i++) {
                Meeting meetingScheduled = meetings[i];

                boolean conflict = meeting.getStartTime().isBefore(meetingScheduled.getEndTime()) &&
                        meeting.getEndTime().isAfter(meetingScheduled.getStartTime());

                if(conflict)
                    return;
            }
        }

        meetings[cont] = meeting;
        cont++;
    }

    public void removeMeeting(Meeting meeting) {
        int counter = 0;
        if(cont != 0) {
            for(Meeting meetingOfTheday : meetings) {
                if(meetingOfTheday != meeting) counter++;
                else {
                    meetings[counter] = null;
                    cont--;
                    System.out.println("Meeting removed:" + meeting.getDescription());
                    break;
                }
            }
        }
    }

//    public double percentageSpentInMeetings() {
//
//    }
//
    public String scheduleAsString() {
        return String.format("%s %s %s", day, startTime, endTime);
    }

    public LocalDate getDay() {
        return day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
