package arrays_iterate.barman2;

import java.util.Scanner;

public class Barman {

    private static Scanner scanner = new Scanner(System.in);

    public static Drink createDrink(){
        System.out.println("Provide number of ingredients");
        int ingredientsNumber = scanner.nextInt();
        scanner.nextLine();
        Ingredient[] ingredients = new Ingredient[ingredientsNumber];
        for (int i = 0; i < ingredients.length; i++){
            ingredients[i] = createIngredient();
        }
        return new Drink(ingredients);
    }

    private static Ingredient createIngredient(){
        System.out.println("Provide name of ingredient");
        String ingName = scanner.nextLine();
        System.out.println("Provide amount of ingredient");
        double ingAmount = scanner.nextDouble();
        scanner.nextLine();
        return new Ingredient(ingName, ingAmount);
    }

    public static  void printDrink(Drink drink){
        Ingredient[] ingredients = drink.getIngredients();
        System.out.println("Drink is made of " + ingredients.length + " ingredients");
        for(Ingredient ingredient : ingredients){
            System.out.println(ingredient.getName() + " , " + ingredient.getAmount());
        }
    }

    public static void main(String[] args) {
        Drink drink = Barman.createDrink();
        Barman.printDrink(drink);
    }
}
