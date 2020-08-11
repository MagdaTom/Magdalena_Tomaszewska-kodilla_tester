package Cabrio;

public class Cabrio {

    private String name;
    private String brand;
    private boolean isMoving;
    private boolean roofOpen;

    public Cabrio(String name, String brand) {
        this.name = name;
        this.brand = brand;
        this.isMoving = false;
        this.roofOpen = false;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public boolean openRoof(boolean isMoving){
        if (isMoving) {
            System.out.println("You can't open or close the roof while the car is moving");
            return roofOpen;
        }else{
            return true;
        }

    }

    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("S40", "Volvo");
        System.out.println(cabrio.isMoving());
        System.out.println(cabrio.isRoofOpen());
        System.out.println(cabrio.openRoof(true));
    }
}
