package Prova1;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Course {
    private enum Room {C102, C104, C105, C106, C107, C209};

    private int id;
    private LocalTime startTime;
    private LocalTime endTime;
    private String name;
    private String code;
    private String professor;
    private DayOfWeek dayOfWeek;
    private Room room;

    public Course(int id, LocalTime startTime, LocalTime endTime, String name, String code, String professor, DayOfWeek dayOfWeek, Room room) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.code = code;
        this.professor = professor;
        this.dayOfWeek = dayOfWeek;
        this.room = room;
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
