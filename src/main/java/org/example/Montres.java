package org.example;

public class Montres {

    private int hours;
    private int minutes;

    public Montres(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String give_time () {
        return ("13 : 45");
    }

    public String give_time_2 () {
        return ("13 : 45");
    }
}
