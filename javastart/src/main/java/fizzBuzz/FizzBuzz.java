package fizzBuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    //Napisz program, który w przypadku liczb podzielnych przez 3 wyświetli liczbę i słowo "Fizz",
    // podzielnych przez 5 wyświetli liczbę i słowo "Buzz",
    // a podzielnych zarówno przez 3 i 5 wyświetli liczbę i słowo "FizzBuzz".
    // Pozostałe liczby nie powinny być wyświetlane. Zakładamy, że pracujemy na liczbach z przedziału <1; 100>.
    // wazna kolejnosc - jezeli najpierw 3, pozniej 5 a na koncu oba to ostatni warunek nie zostanie spelniony gdyz zpelni sie w pierwszym lub drugim;
    //warunek 3 i 5 (lub 15) musi byc pierwszy!!

    public static void main(String[] args) {
//iteracja
       divideBy3And5();
//stream1
        IntStream.iterate(1, i -> i+1)
                .limit(99)
                .forEach(FizzBuzz::divideBy3And5Stream);
        //stream2

        IntStream.rangeClosed(1,99)
                .forEach(number -> {
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.println(number + " FizzBuzz");
                    } else if (number % 3 == 0) {
                        System.out.println(number + " Fizz");
                    } else if (number % 5 == 0) {
                        System.out.println(number + " Buzz");
                    }

                });
        }

    private static void divideBy3And5() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
    }

    private static void divideBy3And5Stream(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println(number + " Fizz");
            } else if (number % 5 == 0) {
                System.out.println(number + " Buzz");
            }
        }
    }


