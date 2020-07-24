package var;
//Napisz program, w którym dodasz do siebie trzy liczby zmiennoprzecinkowe a sumę wyświetlisz na ekranie. Program napisz w dwóch wersjach:
//
//bez wykorzystywania zmiennych
//z wykorzystaniem zmiennych do przechowywania liczb oraz wyniku dodawania
//Przy wyświetlaniu zaokrąglij wynik do dwóch miejsc po przecinku. Wynik powinien być wyświetlony w formie:
public class Exercise1 {
    public static void main(String[] args) {

        System.out.printf("%.2f + %.2f + %.2f = %.2f", 3.0, 2.5, 6.4, (3.0 + 2.5 + 6.4));
        //System.out.printf(locale, format, arguments);

//        W przypadku, gdy nie korzystamy ze zmiennych dodawanie nie jest zbyt wygodne, ponieważ musimy dwa razy powtórzyć wartości,
//                które chcemy wyświetlić, a następnie dodać.
//
//        Metoda printf pomaga nam w zdefiniowaniu tego co chcemy wyświetlić.
//        W naszym przypadku %.2f + %.2f + %.2f = %.2f odpowiada formatowi podanemu w zadaniu,
//                czyli A + B + C = WYNIK, gdzie każda składowa sumy będzie zaokrąglona do 2 miejsc po przecinku.
//                Wartość 3.0 będzie podstawiona pod pierwsze %.2f, wartość 2.5 pod drugie %.2f itd.
//            Metoda printf jest wygodna, bo pozwala uniknąć konkatenacji, która byłaby potrzebna przy tradycyjnej metodzie print, np.:

        System.out.println();

        double a = 3.0;
        double b = 5.5;
        double c = 6.0;

        double result = a + b + c;
        System.out.printf("%.2f + %.2f + %.2f = %.2f", a, b, c, result);
        System.out.println();
        System.out.println(a + b);

    }
}
