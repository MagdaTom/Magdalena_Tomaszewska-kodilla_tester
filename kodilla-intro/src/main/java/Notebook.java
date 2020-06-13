public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;


    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 650) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 650 && this.weight < 1500) {
            System.out.println("This notebook is not so heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkPriceAndYear() {
        if (this.price <= 500 && this.year <= 1998) {
            System.out.println("This notebook cannot work properly.");
        } else if (this.price > 500 && this.price <= 1000 || this.year <= 1998) {
            System.out.println("Don't buy this laptop as it's old.");
        }
        else if(this.price > 3000 || (this.year > 2018 && this.year <= 2020)){
            System.out.println("It seems this notebook is worth its price.");
        }
        else{
            System.out.println("Think twice before buying this laptop");
        }

    }
}



