package Modulo8;

/**
 *
 * @author aunermedina
 */
public class VacationScale {
    int[] vacationDays;
    int yearsOfService;

    public void setVacationScale() {
        vacationDays = new int[7];
        vacationDays[0] = 10;
        vacationDays[1] = 15;
        vacationDays[2] = 15;
        vacationDays[3] = 15;
        vacationDays[4] = 20;
        vacationDays[5] = 20;
        vacationDays[6] = 25;
    }

    public void displayVacationDays() {
        if (yearsOfService >= 0 && yearsOfService < 6) {
            System.out.println("Vacation days: " + vacationDays[yearsOfService]);
        } else if (yearsOfService >= 6) {
            System.out.println("Vacation days: " + vacationDays[6]);
        } else {
            System.out.println("Invalid years of service.");
        }
    }

}
