

public class User {
    String name;
    int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {

        User magda = new User("Magda", 37);
        User jacek = new User("Jacek", 38);
        User janek = new User("Janek", 7);
        User dorota = new User("Dorota", 32);
        User lilka = new User("Lilka", 3);

        User[] users = {magda, jacek, janek, dorota, lilka};


        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();
        }
        int averageAge = result / users.length;


        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < averageAge) {
                System.out.println(users[i].getName());
            }
        }


    }

}