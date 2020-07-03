package Examples;

import java.util.Date;
import java.util.Scanner;

public class Cat {
    private String name;
    private Date date;
    private double weight;
    private String ownerName;


    public String introduceYourself() {
        return "Cats name: " + name + "date " + date + "weight " + weight + "owner " + ownerName;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public String getOwnerName() {
        return ownerName;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    static Scanner sc = new Scanner(System.in);

    public static String getUserInput() {
        return sc.nextLine();
    }
}
