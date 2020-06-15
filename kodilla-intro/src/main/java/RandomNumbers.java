import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    Random random = new Random();
    List<Integer> drawnNumbers = new ArrayList<>();

    public void draw() {
        int sum = 0;
        while (sum < 50) {
            int number = random.nextInt(31);
            sum += number;
            drawnNumbers.add(number);
        }

    }

    public int getMax(){
        int max = -1000000000;
        for (int i = 0; i < drawnNumbers.size(); i++){
            if(drawnNumbers.get(i) > max)max = drawnNumbers.get(i);
        }
        return max;
    }


    public void printDrawnNumbers() {
        for (int i = 0; i < drawnNumbers.size(); i++)
            System.out.println(drawnNumbers.get(i));
    }

    public static void main(String[] args) {

        RandomNumbers numbers = new RandomNumbers();
        numbers.draw();
        numbers.printDrawnNumbers();
        System.out.println("it's maxnumber: " + numbers.getMax());
    }

}
