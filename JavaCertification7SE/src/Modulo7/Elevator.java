package Modulo7;

/**
 *
 * @author aunermedina
 */
public class Elevator {

    public boolean doorOpen = false;
    public int currentFloor = 1;
    public final int TOP_FLOOR = 10;
    public final int MIN_FLOOR = 1;

    public void openDoor() {
        System.out.println("Opening door...");
        doorOpen = true;
        System.out.println("Door is open!");
    }

    public void closeDoor() {
        System.out.println("Closing door...");
        doorOpen = false;
        System.out.println("Door is close!");
    }

    public void goUp() {
        if (currentFloor < TOP_FLOOR) {
            System.out.println("Going up one floor!");
            currentFloor++;
            System.out.println("Floor: " + currentFloor);
        } else {
            System.out.println("Cannot go up!, Floor: " + currentFloor);
        }
    }

    public void goDown() {
        if (currentFloor > MIN_FLOOR) {
            System.out.println("Going down one floor!");
            currentFloor--;
            System.out.println("Floor: " + currentFloor);
        } else {
            System.out.println("Cannot go down!, Floor: " + currentFloor );
        }

    }
}
