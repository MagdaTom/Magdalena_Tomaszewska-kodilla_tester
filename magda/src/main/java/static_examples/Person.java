package static_examples;

public class Person {

    private String name;
    protected static int numberOfPeople;


    public Person(String name) {
        this.name = name;
        numberOfPeople++;
    }

    public String getName() {
        return name;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }
}
