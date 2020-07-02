public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 5};

        System.out.println(sum(numbers));
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[1]);
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 5){
                System.out.println(numbers[i]);

            }
        }


    }
    public static int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }


}
