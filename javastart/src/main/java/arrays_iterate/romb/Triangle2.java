package arrays_iterate.romb;

public class Triangle2 {
    public static void main(String[] args) {


        drawTriangle(5);
    }

    private static void drawTriangle(int size) {
        int stars = 1;
        int spaces = size - 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
                System.out.println();
            spaces--;
            stars++;
            }
        }

    }
