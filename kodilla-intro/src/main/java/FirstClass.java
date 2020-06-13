public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2008);
        System.out.println(notebook.weight + "g " + notebook.price + "PLN " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();

        Notebook heavyNotebook = new Notebook(2000, 500, 1998);
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + "PLN " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndYear();

        Notebook oldNotebook = new Notebook(1200, 5000, 2020);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + "PLN " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndYear();


        }

    }



