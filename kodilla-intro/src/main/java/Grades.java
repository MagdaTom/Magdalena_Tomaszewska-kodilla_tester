import java.util.ArrayList;
import java.util.List;

public class Grades {
    //private final int[] grades;
    List<Integer> grades = new ArrayList<>();


    public Grades() {
        this.grades = grades;
    }

        public double averageGrades () {
            double sum = 0;
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }


        public int displayNewGrade () {
            return grades.get(grades.size() - 1);
        }


    public static void main(String[] args) {

        Grades gradesMath = new Grades();
        gradesMath.grades.add(5);
        gradesMath.grades.add(4);
        gradesMath.grades.add(3);
        System.out.println(gradesMath.displayNewGrade());
        System.out.println(gradesMath.grades.size());
        System.out.println(gradesMath.averageGrades());
    }
}


