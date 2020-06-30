package MyScanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
//        System.out.println("Provide your name: ");
//
//        while (true) {
//            String line = scanner.nextLine();
//            System.out.println("I wrote my name: " + line);
//            if(line.equals("The End")){
//                System.out.println("This is the end");
//                break;
//            }
//
//        }lub:
//
//        do{
//            line = scanner.nextLine();
//            System.out.println("My name is: "+ line);
//        }while (!line.equals("The end")); wypisze my name i sThe end a dopiero pozniej the end
//        System.out.println("The end");
        // lub:

        while (!(line = scanner.nextLine()).equals("The end")) { // od razu wypisze the end
            System.out.println("Provide your name: " + line);

        }
        System.out.println("The end");
    }
}