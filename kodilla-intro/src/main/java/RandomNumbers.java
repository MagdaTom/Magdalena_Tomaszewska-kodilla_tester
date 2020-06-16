import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    Random random = new Random();
    List<Integer> drawnNumbers = new ArrayList<>();


    public void draw() {
        int sum = 0;
        while (sum < 5000) {
            int number = random.nextInt(31);
            sum += number;
            drawnNumbers.add(number);
        }

    }

    public void printDrawnNumbers() {
        for (int i = 0; i < drawnNumbers.size(); i++)
            System.out.println(drawnNumbers.get(i));
    }

    public int getMax() {
        int max = -1;
        for (int i = 0; i < drawnNumbers.size(); i++) {
            if (drawnNumbers.get(i) > max) max = drawnNumbers.get(i);
        }
        return max;
    }

    public int getMin() {
        int min = 31;
        for (int i = 0; i < drawnNumbers.size(); i++) {
            if (drawnNumbers.get(i) < min) min = drawnNumbers.get(i);
        }
        return min;
    }


    public static void main(String[] args) {

        RandomNumbers numbers = new RandomNumbers();
        numbers.draw();
        numbers.printDrawnNumbers();
        System.out.println("Max. number: " + numbers.getMax());
        System.out.println("Min. number: " + numbers.getMin());

    }

}
