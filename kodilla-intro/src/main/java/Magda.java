
public class Magda {
    public static void main(String[] args) {


        int liczbagwiazdek = 1;
        for (int i = 1; i <= 5; i++) { //pętla odpowiedzialna za każdy poziom - wyrysowanie poziomu
            for (int j = 1; j <= liczbagwiazdek; j++) {//pętla odpowiedzialna za wyrysowanie gwiazdek
                System.out.print("*");
            }
            System.out.println();
            liczbagwiazdek++;
        }
    }
}










