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

    public int countOfDay(Date d1, Date d2) {
        int one = d1.year*365+d1.month*30+d1.day;
        int two = d2.year*365+d2.month*30+d2.day;
        return one-two;
    }



    public enum days {. }
}
