public class Magda {
    public static void main(String[] args) {

        System.out.println(suma());
    }

    private static int suma() {
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                result = result + (i);
            }
        }
            return result;
        }
    }


