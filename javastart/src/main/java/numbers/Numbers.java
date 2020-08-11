package numbers;

//Wczytaj od użytkownika dowolną liczbę całkowitą różną od 0.
// Jeżeli liczba jest większa od 0 wyświetl na ekranie wszystkie liczby z przedziału [0, N],
// gdzie N jest liczbą podaną przez użytkownika z odstępem co 0.1.
// Jeśli liczba jest mniejsza od 0 wyświetl liczby od 0 do N (w porządku malejącym).
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide number");
        double number = scanner.nextInt();
        if(number > 0 ) {
            for (double i = 0; i < (number + 0.1); i += 0.1)
                System.out.printf("%.1f ", i);
        }else if(number < 0){
            for(double i = 0; i > (number - 0.1); i-=0.1)
                System.out.println(i);

        }
       // Zapis %.1f oznacza liczbę zmiennoprzecinkową zaokrągloną do 1 miejsca po przecinku.
    }
}
