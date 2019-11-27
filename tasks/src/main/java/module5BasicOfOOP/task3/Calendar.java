package module5BasicOfOOP.task3;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private List<Day> days = new ArrayList<>();
    private int year;

    public Calendar(int year, int weekDayOneJanuary) {
        this.year = year;
        createDays(weekDayOneJanuary);

    }


    private class Day {

        private int day;
        private int month;
        private boolean isHoliday;
        private boolean isWeekend;

        public Day(int day, int month, boolean isHoliday, boolean isWeekend) {
            setMonth(month);
            setDay(day);
            this.isHoliday = isHoliday;
            this.isWeekend = isWeekend;
        }


        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public boolean isHoliday() {
            return isHoliday;
        }

        public boolean isWeekend() {
            return isWeekend;
        }


        public void setDay(int day) {

            switch (month) {
                case 0:
                case 2:
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                    if (0 <= day && day < 31) {
                        this.day = day;
                    } else {
                        this.day = 1;
                    }
                    break;

                case 3:
                case 5:
                case 8:
                case 10:
                    if (0 <= day && day < 30) {
                        this.day = day;
                    } else {
                        this.day = 1;
                    }
                    break;
                case 1:
                    if (isLeap(year) && 0 <= day && day < 28) {
                        this.day = day;
                    } else if (isLeap(year) && 0 <= day && day < 29) {
                        this.day = day;
                    } else {
                        this.day = 1;
                    }
                    break;

            }

            this.day = day;
        }

        public void setMonth(int month) {
            if (0 <= month && month < 12) {
                this.month = month;
            } else {
                this.month = 1;
            }
        }

        public void setHoliday(boolean holiday) {
            isHoliday = holiday;
        }

        @Override
        public String toString() {
            return "day=" + day +
                    ", month=" + month + "\n";
        }
    }


    public int getYear() {
        return year;
    }

    public List<Day> getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "year=" + year +
                ", days=" + days;
    }

    private void createDays(int weekDayOneJanuary) {

        boolean isWeekend;

        int day;
        int month;

        for (int i = 0; i < (isLeap(year) ? 366 : 365); i++) {

            if ((i + weekDayOneJanuary) % 7 == 6 || (i + weekDayOneJanuary) % 7 == 0) {
                isWeekend = true;
            } else {
                isWeekend = false;
            }

            month = getMonth(i, year);
            day = getDay(i, year);

            days.add(new Day(day, month, false, isWeekend));

        }
    }

    public boolean setHoliday(int day, int month, boolean isHoliday) {

        for (Day day1 : days) {

            if (day1.getMonth() == month - 1 && day1.getDay() == day - 1) {
                day1.setHoliday(isHoliday);
                return true;
            } else if (month < day1.getMonth()) {
                return false;
            }

        }

        return false;
    }

    public void printMonth(int month) {


        for (Day day : days) {

            if (month == day.getMonth()) {
                System.out.printf("%2d- %2d isWeekend= %1s,  isHoliday= %1s \n", (day.getMonth() + 1), (day.getDay() + 1), day.isWeekend() ? "+" : "-", day.isHoliday() ? "+" : "-");
                month = day.getMonth();
            } else if (month < day.month) {
                return;
            }

        }

    }

    public static int getMonth(int dayOfYear, int year) {

        boolean isLeap = year % 4 == 0;

        List<Integer> months = List.of(31, isLeap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

        int sum = -1;

        for (int i = 0; i < months.size(); i++) {
            sum += months.get(i);

            if (sum >= dayOfYear) {
                return i;
            }
        }

        return 0;
    }

    public static int getDay(int dayOfYear, int year) {

        boolean isLeap = year % 4 == 0;

        List<Integer> months = List.of(31, isLeap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

        int sum = -1;

        for (int i = 0; i < months.size(); i++) {
            if (sum + months.get(i) >= dayOfYear) {
                return dayOfYear - sum - 1;
            }
            sum += months.get(i);

        }

        return 0;

    }

    public static boolean isLeap(int year) {

        return year % 4 == 0;

    }


}
