
public class Magda {
    public static void main(String[] args) {

    String zmienna1 = "Magda";
    String zmienna2 = "Magda";

    boolean wynik = zmienna1 == zmienna2; //referencje/adres, literał odnosi się do tego samego miejsca w pamięci
        System.out.println(wynik);

        String zmienna3 = new String("Magda");
        String zmienna4 = new String("Magda");

        boolean wynik2 = zmienna3 == zmienna4; // dwa obiekty to dwa rozne Stringi,
        System.out.println(wynik2);

        System.out.println(zmienna1.equals(zmienna2));

    }

}










