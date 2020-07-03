package Examples;

import java.util.ArrayList;
import java.util.List;

public class Student {

//    2. Stwórz klasę opisującą studenta (imię, nazwisko, numer indeksu), a następnie stwórz jej tablicę obiektów.
//            3. Podaj ile elementów zawiera tablica z zadania 2, oraz co znajduje się w 3 elemencie tej tablicy.
    //analogicznie dla Listy

    private String firstName;
    private String secondName;
    private int indexNumber;
    //static int id = 1;


    public Student(String firstName,String secondName, int indexNumber){
        this.firstName = firstName;
        this.secondName = secondName;
        this.indexNumber = indexNumber;
        //this.indexNumber = id;
        //id++; wtedy bez indexNumber w konstruktrze, zostanie autpmatycznie nadany;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public static void main(String[] args) {

        Student studentMa = new Student("Ma", "ga", 123);
        Student studentKa = new Student("Ka", "ga", 124);
        Student studentLa = new Student("La", "ga", 133);

        Student [] students = new Student[] {studentKa, studentLa, studentMa};
        System.out.println(students.length);
        System.out.println();
        System.out.println(students[2].getSecondName());
        System.out.println();
        for(Student student : students)
            System.out.println(student.getFirstName());

        System.out.println("-----------------------------------------------------");

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentMa);
        studentList.add(studentKa);
        studentList.add(studentLa);

        System.out.println(studentList.size());
        System.out.println(studentList.get(2).getSecondName());

    }
}
