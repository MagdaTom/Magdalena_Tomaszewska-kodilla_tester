public class Magda {
    public static void main(String[] args) {

        int liczba1 = 5;
        int liczba2 = 6;

        int[] tabela = new int[3];
        tabela[0] = 2;
        tabela[1] = 3;
        tabela[2] = 4;

        sumAndDisplay(liczba1, liczba2);
        System.out.println(sum(liczba1, liczba2));
        System.out.println(subtract());
        System.out.println(multiply());
        System.out.println(multiply(tabela));

    }
    public static void sumAndDisplay(int a, int b){
        int result = a + b;
        System.out.println(result);
    }
    private static int sum(int a, int b){
        return a + b;
    }

    private static int subtract(){
        return 5 - 10;
    }
    private static int multiply(){
        int result = 1;
        for(int i = 1; i <= 4; i++){
            result = result * i;
        }
        return result;
    }
    private static int multiply(int[] tabela){
        int result = 1;
        for (int i = 0; i < tabela.length; i++){
            result = result * tabela[i];
        }
        return result;
    }
}



