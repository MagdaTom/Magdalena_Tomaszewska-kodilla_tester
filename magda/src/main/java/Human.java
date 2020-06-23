public class Human {

    private int age;
    private double weight;
    private double height;
    private String name;
    private boolean isMale;

    public Human (int age, double weight, double height, String name, boolean isMale){
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
    }

    private String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }
    public boolean isMale(){
        return isMale;
    }

    public static void main(String[] args) {

        Human human = new Human(15, 46.5, 165, "Jacek", false);

        System.out.println(human.getAge());
        System.out.println(human.getHeight());
        System.out.println(human.getName());
        System.out.println(human.isMale());
    }


}
