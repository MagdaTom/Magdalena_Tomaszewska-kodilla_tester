package arrays_iterate.barman2;

import java.util.ArrayList;
import java.util.List;

public class Drink {

    private Ingredient[] ingredients;

    public Drink(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
