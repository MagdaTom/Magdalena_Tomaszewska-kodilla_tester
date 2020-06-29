package static_examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    public static void main(String[] args) {

        persons();

        tests();

        citizen();


    }

    private static void citizen() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = simpleDateFormat.parse("2013-05-06");
            Citizen citizen = new Citizen("Janek", date );
            citizen.writeInfo();
            System.out.println(citizen.dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void tests() {
        Test test = new Test();
        Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = new Test();

        Test.text = "bla bla";
        test.text = "bla bla2";
        System.out.println(test3.text);
    }

    private static void persons() {
        Person person = new Person("Magda");
        Person person1 = new Person("Wiola");
        Person person2 = new Person("Jagoda");
        Person person3 = new Person("Tosia");

        System.out.println(Person.getNumberOfPeople());
    }


}
