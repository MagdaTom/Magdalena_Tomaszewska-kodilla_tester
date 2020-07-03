import java.util.Scanner;

public class ApplicationTV {
    public static void main(String[] args) {
        obslugaTelewizora();

    }

    private static void obslugaTelewizora(){
        Scanner scanner = new Scanner(System.in);
        UE43RU7172 tv = new UE43RU7172("UnikalneId");

        int opcja =0;
        System.out.println("1. Wlacz; 2.Wylacz; 3.Zmien program; 4.Zakoncz program");
        while(opcja !=4){
            opcja = scanner.nextInt();

            switch (opcja){
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("Podaj numer programu: ");
                    int numer = scanner.nextInt();
                    tv.przelaczProgram(numer);
                    break;

            }
        }
    }
}
