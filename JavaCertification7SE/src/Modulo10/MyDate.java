package Modulo10;

/**
 *
 * @author aunermedina
 * @date SAT, Sept 20 2014
 */
public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;
    
    public MyDate(){
        
    }
    
    public MyDate(int Day, int Month, int Year) {
        this.day = Day;
        this.month = Month;
        this.year = Year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    
}

