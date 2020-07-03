package Examples;

import java.util.Scanner;

//Utwórz klasę interfejs. Klasa ta powinna być aplikacją (tzn. żeby można było ją uruchomić) i powinna pytać o nastepujące elementy:
//
//        imię kota
//        opiekun
//        Oraz zapisywać je w utworzonym na początku działania programu obiekcie kotka


public class Interface {
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println("Provide cat's name: ");
        cat.setName(inputScanner.nextLine().trim()); //bez metody, bezposcrednio uzywajac metody scannera
        System.out.println("Provide owner: ");
        cat.setOwnerName(getUserInput()); // za pomoca metody utworzonej ponizej
        System.out.println(cat.getName()+  " " + cat.getOwnerName());

        // lub String text = inputScanner.nextLine().trim(); cat.setName(text);
    }

    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }
}

