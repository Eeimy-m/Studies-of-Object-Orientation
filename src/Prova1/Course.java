package Prova1;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Course {
    enum Room {C102, C104, C105, C106, C107, C209};

    private static int id;
    private LocalTime startTime;
    private LocalTime endTime;
    private String name;
    private String code;
    private String professor;
    private DayOfWeek dayOfWeek;
    private Room room;

    public Course(LocalTime startTime, LocalTime endTime, String name, String code, String professor, DayOfWeek dayOfWeek, Room room) {
        if(endTime == null || startTime == null || name == null || code == null || professor == null || dayOfWeek == null) {
            return;
        }

        this.id++;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.code = code;
        this.professor = professor;
        this.dayOfWeek = dayOfWeek;
        this.room = room;
    }

    public int getWeeklyDurationInMinutes() {
        return (endTime.getHour() - startTime.getHour()) * 60 + (endTime.getMinute() - startTime.getMinute());
    }

    public String getStateAsString() {
        return String.format("id = %d | Name: %s | Code: %s | Professor: %s | Start Time: %s | End Time: %s | Day of week: %s | Room: %s", id, name, code, professor, startTime, endTime, dayOfWeek, room);
    }

    public int getId() {
        return id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getProfessor() {
        return professor;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Room getRoom() {
        return room;
    }
}
