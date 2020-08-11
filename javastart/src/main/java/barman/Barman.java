package barman;

//Zabieg, w którym klasa posiada pola będące innym typem obiektowym nazywamy w programowaniu obiektowym agregacją.
public class Barman {

    public static Drink createDrink(String ingredient1, double quantity1,
                                    String ingredient2, double quantity2,
                                    String ingredient3, double quantity3){
        Ingredient ing1 = new Ingredient(ingredient1, quantity1);
        Ingredient ing2 = new Ingredient(ingredient2,quantity2);
        Ingredient ing3 = new Ingredient(ingredient3,quantity3);
        return new Drink(ing1, ing2, ing3);
    }

    public static void printDrink(Drink drink){
        double ingredientSum = drink.getIngredient1().getQuantity() + drink.getIngredient2().getQuantity() + drink.getIngredient3().getQuantity();
    double ing1Part = drink.getIngredient1().getQuantity()/ingredientSum;
    double ing2Part = drink.getIngredient2().getQuantity()/ingredientSum;
    double ing3Part = drink.getIngredient3().getQuantity()/ingredientSum;
        System.out.println("Ingredients: " + drink.getIngredient1().getName() + ", " + drink.getIngredient2().getName() + ", " + drink.getIngredient3().getName() + "; Proportions: " + ing1Part + ", " + ing2Part + ", " + ing3Part + "; Total amount: " + ingredientSum);
   //System.out.printf("Składniki drinka to: %s, %s, %s " +
        //                "w proporcjach %.2f, %.2f, %.2f." +
        //                "Jego pojemność to %.0fml\n",
        //                drink.getIngredient1().getName(), drink.getIngredient2().getName(), drink.getIngredient3().getName(),
        //                ing1Part, ing2Part, ing3Part,
        //                ingredientSum);
        //%.2f oznacza liczbę zmiennoprzecinkową zaokrągloną do dwóch miejsc po przecinku,
        //%0f oznacza liczbę zmiennoprzecinkową bez części dziesiętnej (używamy %f a nie %d, ponieważ posługujemy się typem double a nie int).
        //%s oznacza wartość typu String
    }

    public static void main(String[] args) {
        Drink drink = Barman.createDrink("Sok ananasowy", 100, "Likier malibu", 50, "Mleko kokosowe", 100);
        //metody statyczne - czyli nie trzeba tworzyc obiektu typu Barman!; ani Drink drink = new Drink bo w barman mamy metode
        Barman.printDrink(drink);
        Drink drink2 = new Drink(new Ingredient("Sok ananasowy" , 100), new Ingredient("Likier malibu", 50), new Ingredient("Mleko kokosowe", 100) );
        Barman.printDrink(drink2);


    }

}
