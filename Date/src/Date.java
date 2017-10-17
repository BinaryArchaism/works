/**
 * Created by Dmitrii on 09.10.2017.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isYearLeap(int year) {
        return ((year % 400 == 0)|| ((year % 100 != 0) && (year % 4 == 0)));
    }

    private int countOfDaysInYear(int year) {
        if (isYearLeap(year)) return 366;
        else return 365;
    }

    private int countOfDaysInMonth(int year, int month) {
        int countofDayInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        if (month == 2 && isYearLeap(year)) return 29;
        else return countofDayInMonth[month];
    }

    private boolean isDateTrue(Date date){
        return (date.year >= 1901 && date.month >= 1 && date.month <= 12 && date.day >= 1 && date.day <= countOfDaysInMonth(date.year, date.month));
    }

    public Date nextDate(Date date) {
        if (isDateTrue(date)) {
            if (date.day < countOfDaysInMonth(date.year, date.month)) date.day += 1;
            else {
                date.day = 1;
                date.month += 1;
            }
            if (date.month == 13) {
                date.month = 1;
                date.year += 1;
            }
        } else System.out.println("Error");
        return date;
    }

    private int countOfDaysFromStart(Date date) {
        int _day = 0;
        for (int y = 1901; y < date.year; y++) _day = _day + countOfDaysInYear(y);
        for (int m = 1; m < date.month; m++) _day = _day + countOfDaysInMonth(date.year, m);
        _day = _day + date.day;
        return _day;
    }

    private Date defineDate(int days) {
        int year = 1901;
        while (days > countOfDaysInYear(year)){
            days = days - countOfDaysInYear(year);
            year += 1;
        }
        int month = 1;
        while (days > countOfDaysInMonth(year, month)) {
            days = days - countOfDaysInMonth(year, month);
            month += 1;
        }
        int d = days;
        return new Date(d, month, year);
    }

    public Date setDate(Date date, int days) {
        int d = countOfDaysFromStart(date);
        d += days;
        return defineDate(d);
    }

    public int countOfDaysBetweenDates(Date d1, Date d2) {
        return Math.abs((countOfDaysFromStart(d1) - countOfDaysFromStart(d2)));
    }

    public int[][] sortDate(int date[][]) {
        Date date1[] = new Date[date.length];
        for (int i = 0; i < date.length; i++) {
            date1[i] = new Date(date[i][0], date[i][1], date[i][2]);
        }
        int d[] = new int[date.length];
        for (int i = 0; i < date.length; i++) {
            d[i] = countOfDaysFromStart(date1[i]);
        }
        for (int i = 1; i < date.length; i++) {
            int c = d[i];
            int p = i - 1;
            while (p >= 0 && d[p] > c) {
                d[p+1] = d[p];
                p--;
            }
            d[p+1] = c;
        }
        for (int i = 0; i < date.length; i++) {
            date1[i] = defineDate(d[i]);
        }
        int ret[][] = new int[date.length][3];
        for (int i = 0; i < date.length; i ++) {
            ret[i][0] = date1[i].day;
            ret[i][1] = date1[i].month;
            ret[i][2] = date1[i].year;
        }
        return ret;
    }
}
