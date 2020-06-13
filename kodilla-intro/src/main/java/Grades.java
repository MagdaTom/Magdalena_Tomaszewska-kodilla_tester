public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;


    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }


    public double averageGrades() {
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + this.grades[i];
        }
        return sum / this.size;
    }


    public int displayNewGrade() {
        return this.grades[this.size - 1];
    }

    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.add(5);
        grades.add(6);
        grades.add(3);
        System.out.println(grades.displayNewGrade());
        System.out.println(grades.size);
        System.out.println(grades.averageGrades());
    }
}


