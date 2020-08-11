package Cabrio;

//Zdefiniuj klasę Cabrio reprezentującą samochód z otwieranym dachem. Samochód powinien przechowywać informację o nazwie,
// marce, ale także to, czy aktualnie się porusza oraz, czy dach jest otwarty. Ograniczeniem jest to,
// że nie powinno być możliwe otwarcie ani zamknięcie dachu w sytuacji, gdy samochód jest w ruchu. Jeśli samochód jest w ruchu
// i ktoś spróbuje otworzyć lub złożyć dach powinien zostać wyświetlony komunikat o błędzie a dach powinien z
// ostać w swojej aktualnej pozycji.
//
//W osobnej klasie stwórz obiekt reprezentujący samochód i przetestuj otwieranie dachu w sytuacji,
// gdy samochód jest w ruchu oraz w spoczynku.

public class Cabrio1 {

    private String model;
    private String brand;
    private boolean moving;
    private boolean roofOpen;

    public Cabrio1(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if(moving) {
            System.out.println("Nie możesz otwierać ani składać dachu podczas jazdy!");
        } else {
            this.roofOpen = roofOpen;
        }
    }

    public static void main(String[] args) {
        Cabrio1 cabrio = new Cabrio1("S40", "Volvo");
        cabrio.setRoofOpen(true);
        System.out.println("is moving: " + cabrio.isMoving() + ", " + "is the roof open: " + cabrio.isRoofOpen());

        cabrio.setMoving(true);
        cabrio.setRoofOpen(false);
        System.out.println("is moving: " + cabrio.isMoving() + ", " + "is the roof open: " + cabrio.isRoofOpen());

    }

}
