package module4ProgrammingWithClasses.elementaryClassesAndObjects.task6;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }

    public Clock() {
        this(10, 10, 10);
    }

    public void setHour(int hour) {
        if (hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if (minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if (second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void changeToHoursInterval(int intervalHour) {
        hour = (hour + intervalHour) % 24;
    }

    public void changeToMinutesInterval(int intervalMinutes) {
        int newMinute = minute + intervalMinutes;

        if (newMinute >= 60) {
            changeToHoursInterval(newMinute / 60);
        }
        minute = newMinute % 60;
    }

    public void changeToSecondsInterval(int intervalSeconds) {
        int newSecond = second + intervalSeconds;

        if (newSecond >= 60) {
            changeToMinutesInterval(newSecond / 60);
        }
        second = newSecond % 60;
    }

    public void printClock() {
        System.out.println(hour + ":" + minute + ":" + second);
    }


}
