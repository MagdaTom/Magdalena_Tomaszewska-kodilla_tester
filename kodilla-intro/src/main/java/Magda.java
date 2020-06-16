
public class Magda {
    public static void main(String[] args) {

/*Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami
Wypisz wszystkie liczby z tej tablicy na ekran. Następnie wypisz
wszystkie liczby od tyłu.Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów
 */
        int[] numbers = new int[]{1, 5, 8, 6, 7, 15, 25, 68, 72, 15};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length-1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        int sum = 0;
    for(int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
        System.out.println(sum);

    }
}









