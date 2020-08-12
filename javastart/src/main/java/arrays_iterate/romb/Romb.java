package arrays_iterate.romb;

//apisz program, w którym użytkownik podaje liczbę całkowitą, a następnie w konsoli rysowany jest romb,
// którego boki składają się z tylu gwiazdek co liczba zadana w programie.
public class Romb {
    public static void main(String[] args) {

        draw(4);
    }

    private static void draw(int size) {
        for (int i = 0; i < size; i++) {
    drawSpaces(size - i - 1); // dla drawSpaces(size - 1) - wyjdzie prostokat
    drawStars(size);
            System.out.println();
        }
    }

    private static void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    private static void drawStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }

    }
}

//private static void draw(int size) {
//    for (int i = 0; i < size; i++) {
//        for (int j = 0; j < size - i - 1; j++) {
//            System.out.print(" ");
//        }
//        for (int j = 0; j < size; j++) {
//            System.out.print("*");
//        }
//        System.out.println(); //new line
//    }