package arrays_iterate.romb;

public class Triangle {

    public static void main(String[] args) {

        drawTriangle(5);
    }

    private static void drawTriangle(int size) {
        for(int i = 1; i <= size; i++) { //poziom - wysokosc trojkata
            for (int j = 1; j <= i; j++) { //rysowanie ilosc gwiazdek
                System.out.print("*");
            }
            System.out.println();

        }
    }
    //dla kazdego poziomu naryzuj gwiazdke, po naryzowaniu przejdz do lokejnej linii i zwieksz gwiazdke o jeden;
    //private static void drawTriangle(int size) {
    //int stars = 1;
    //        for(int i = 1; i <= size; i++) { //poziom - wysokosc trojkata
    //            for (int j = 1; j <= stars; j++) { //rysowanie ilosc gwiazdek
    //                System.out.print("*");
    //            }
    //            System.out.println();
    //stars++
    //        }
}
