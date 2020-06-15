import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Colour {


    public static String getUserSelection(){
        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Select first letter (R, W, B, G, Y) :");
                String colour = scanner.nextLine();
                switch (colour){
                    case "R" : return "Red";
                    case "W" : return "White";
                    case "B" : return "Black";
                    case "G" : return "Green";
                    case "Y" : return "Yellow";
                    default:
                        System.out.println("Colour not found");

                }
            }
        }
        public static void main(String[] args){
            System.out.println(getUserSelection());
        }
    }

