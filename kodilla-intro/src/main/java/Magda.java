
public class Magda {
    public static void main(String[] args) {

// Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0
        for (int i = 0; i < 31; i++) {
            System.out.println(i);
        }
        for(int i = 30; i >=0; i--){
            System.out.println(i);
        }
//Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //lub

        for (int i = 0; i < 31; i += 2) {
            System.out.println(i);

        }
        /* Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b
        Wypisz na ekran zakres liczb od a do b.*/
        int a = 5;
        int b = 10;

        for(int i = a; i<= b; i ++){
            System.out.println(i);
        }


    }
}









