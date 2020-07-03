package Examples;

import java.util.Scanner;

public class ScannerCat {

  static Scanner sc = new Scanner(System.in);

    public static String getUserInput(){
        return sc.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Provide your name: ");
        String nameGivenByUser = getUserInput();
        System.out.println("Given name: " + nameGivenByUser);
    }
}
