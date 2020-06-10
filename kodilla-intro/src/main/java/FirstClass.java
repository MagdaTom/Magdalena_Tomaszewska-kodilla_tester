public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1000);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook ("2000g", 500);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook ("1200g", 5000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();

    }
}
/* public class Notebook {
    String weight;
    int price;

    public Notebook(String weight, int price){
        this.weight = weight;
        this.price = price;
    }
    public void checkPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }
} */