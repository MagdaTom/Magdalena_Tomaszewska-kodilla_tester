package barman;
//Zdefiniuj klasę Barman, która posiada metodę createDrink przyjmującą jako argumenty nazwy oraz ilość
// 3 składników potrzebnych do przygotowania drinka. W wyniku metoda powinna zwracać obiekt typu Drink z informacjami
// o składnikach danego drinka. Każdy składnik w klasie Drink powinien być reprezentowany przez klasę Ingredient,
// która przechowuje nazwę oraz ilość danego składnika.
//
//Klasa Barman powinna także posiadać metodę printDrink

public class Drink {
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;

    public Drink(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    public Ingredient getIngredient1() {
        return ingredient1;
    }

    public Ingredient getIngredient2() {
        return ingredient2;
    }

    public Ingredient getIngredient3() {
        return ingredient3;
    }

    public void setIngredient1(Ingredient ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public void setIngredient2(Ingredient ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public void setIngredient3(Ingredient ingredient3) {
        this.ingredient3 = ingredient3;
    }
}
