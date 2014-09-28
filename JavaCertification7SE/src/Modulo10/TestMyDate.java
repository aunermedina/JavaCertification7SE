package Modulo10;

/**
 *
 * @author aunermedina
 * @date   sat, Sept 20, 2014
 */
public class TestMyDate {
    public static void main(String[] args) {
        MyDate fecha = new MyDate();
        System.out.println(fecha);
        changeDate(fecha);
        System.out.println(fecha);
    }
    
    public static void changeDate(MyDate fecha) {
        fecha.setDay(20);
        fecha.setMonth(9);
        fecha.setYear(2014);
    }
}
