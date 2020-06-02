public class Loops {
    public static void main(String[] args){
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int firstNumber = numbers[0];
        int secondNumber = numbers[1];
        int thirdNumber = numbers[2];
        int numberOfElements = numbers.length;


        int sumAll = sum(numbers);
        System.out.println(sumAll);

}
    public static int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }


}



