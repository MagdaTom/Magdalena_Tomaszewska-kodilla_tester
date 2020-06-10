public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1000);
        System.out.println(notebook.weight + " " + notebook.price);
        //System.out.println(notebook.price);

        Notebook heavyNotebook = new Notebook ("2000g", 500);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);

        Notebook oldNotebook = new Notebook ("1200g", 5000);
        System.out.println(oldNotebook.weight);
        System.out.println(oldNotebook.price);
    }
}
/* public class Notebook {
    String weight;
    int price;

    public Notebook(String weight, int price){
        this.weight = weight;
        this.price = price;
    }

} */