package org.example.clock;

public class Сlock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;

    }

    public int getSeconds() {
        return seconds;
    }

    public void tick() {
       this.seconds++;
    if(this.seconds >= 60){
        this.seconds = 0;
        minutes++;
        if (this.minutes >= 60) {
            this.minutes = 0;
            this.hours++;
            if (this.hours >= 24){
                this.hours = 0;
            }
        }

    }
}

    @Override
    public void readTime () {
        System.out.println("Current time: " + hours + "h " + minutes + "m " + seconds + "s "   );
    }
}
