package main;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    
    private int year;
    private int month;
    private int day;
    
    public MyDate() {
        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    
    // Year    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>0)
            this.year = year;
        else
            System.err.println("Error, Bad request");
    }

    
    // Month
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >=1 && month <= 12)
            this.month = month;
        else
            System.err.println("Error, Bad request");
            
    }

    
    // Day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >=1 && day <= 31)
            this.day = day;
        else
            System.err.println("Error, Bad request");
    }
    
    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    
}
