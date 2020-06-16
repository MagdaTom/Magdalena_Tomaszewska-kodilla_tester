import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Magda {
    public static void main(String[] args) {
    Random random = new Random();  //   Stworzenie obiektu klasy Random, który posłuży do loswania liczb

    int number = random.nextInt(11); /* metoda nextInt() wylosuje liczbe calkowita z zakresu int - losuje liczbe z zakresu
        0 - n-1 (czyli aby wylosowac z zakresu 0 -10 trzeba woisac 11*/

    System.out.println(number);
    }
}











