package static_examples;

import java.util.Date;

public class Citizen extends Person{

    public int id;
    Date dateOfBirth;

    public Citizen(String name, Date date) {
        super(name);
        dateOfBirth = date;
    }

    public void writeInfo(){
        System.out.println(this.id + "," + this.getName() + "," + numberOfPeople);
    }
}
