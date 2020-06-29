import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wprowadz liczbe calkowita od 1 do 10");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10)+1;

        if(inputNumber == randomNumber){
            System.out.println("Wygrales");
        }
        else{
            System.out.println("Przegrales. Liczb losowa wynosila " + randomNumber);
        }
        System.out.println("Dziekuje za gre");
        keyboard.close();
    }
}
