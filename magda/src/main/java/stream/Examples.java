package stream;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {


        int[] k = new int[]{5, 7, 8, 9};
        Arrays.stream(k)
                .forEach(b -> System.out.println(b));
        System.out.println();

        Random rnd = new Random();
        rnd.ints(10, 0, 5)
                .forEach(d -> System.out.println(d));
        System.out.println();

//obliczanie sumy liczb parzystych od 2 do 20)
        int total = 0;
        for (int i = 0; i <= 20; i += 2) {
            total += i;
        }
        System.out.println(total);
        System.out.println();

        int sum = IntStream.rangeClosed(1, 10)//obiekt IntStream z elementami 1, 2, 3, 4, 5, 6, 7, 8, 9 i 10.
                .map(x -> x * 2)
                .sum();
        System.out.println(sum);
        System.out.println();

//        Poniższy kod wybiera tylko parzyste liczby całkowite z przedziału
//        od 1 do 10, a następnie mnoży je przez 3 i zwraca ich sumę:

        int totalSum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                totalSum += i * 3;
            }
        }
        System.out.println(totalSum);

        int totalSum2 = IntStream.rangeClosed(1, 10)
                .filter(a -> a % 2 == 0)
                .map(x -> x * 3)
                .sum();
        System.out.println(totalSum2);

        //lub bez zmiennej strumien bezposrednio w System.out

        System.out.println(IntStream.rangeClosed(1, 10)
                .filter(a -> a % 2 == 0)
                .map(x -> x * 3)
                .sum());
    }
}
