package Examples;

import org.w3c.dom.ls.LSOutput;

public class CheckPassFail {
    public static void main(String[] args) {

        //     Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50;
        //     or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
        int mark = 15;

        if (mark >= 50)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");


        int number = 6;
        System.out.println();

        //Write a method called CheckOddEven which returns "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
        // The program shall always print “bye!” before exiting.
        System.out.println(CheckOddEven(number));
        System.out.println("DONE");

    }

    private static String CheckOddEven(int number) {
        if (number % 2 == 0) {
            return "Odd number";
        } else {
            return "Even number";
        }
    }
}
