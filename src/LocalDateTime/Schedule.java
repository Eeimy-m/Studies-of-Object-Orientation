package LocalDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;

    private Meeting[] meetings;
    private int cont;

    public Schedule(LocalDate day, LocalTime startTime, LocalTime endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void addMeeting(Meeting meeting) {
        if(cont != 0) {
            for(Meeting meetingScheduled : meetings) {
                LocalTime meetingStartTime = meetingScheduled.getStartTime();
                LocalTime meetingEndTime = meetingScheduled.getEndTime();

                if(meetingStartTime.isAfter(meeting.getStartTime()) && meetingStartTime.isBefore(meeting.getEndTime()))
                    break;
                else if(meetingEndTime.isAfter(meeting.getStartTime()) && meetingEndTime.isBefore(meeting.getEndTime()))
                    break;
            }
        }

        meetings[cont] = meeting;
        cont++;
    }

    public void removeMeeting(Meeting meeting) {

    }

//    public double percentageSpentInMeetings() {
//
//    }
//
//    public String  scheduleAsString() {
//
//    }

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
