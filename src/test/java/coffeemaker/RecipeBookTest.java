package coffeemaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.domain.Recipe;
import coffeemaker.domain.RecipeBook;

public class RecipeBookTest {
    
    private RecipeBook recipeBook;
    private Recipe coffee;

    @BeforeEach
    void setUp() {
        recipeBook = new RecipeBook();

        coffee = new Recipe();
        coffee.setName("Coffee");
    }

    @Test
    @DisplayName("Add recipe works")
    void testAddRecipeSuccess() {
        assertEquals(true, recipeBook.addRecipe(coffee));
    }

    @Test
    @DisplayName("Add recipe fails when duplicate exists")
    void testAddRecipeDuplicateFails() {
        recipeBook.addRecipe(coffee);
        assertEquals(false, recipeBook.addRecipe(coffee));
    }

    @Test
    @DisplayName("Adding recipe fails when recipe is null ")
    void testAddNullRecipeFails() {
        assertEquals(false, recipeBook.addRecipe(null));
    }

    @Test
    @DisplayName("Add recipe fails when book is full")
    void testAddRecipeFailsWhenFull() {
        for (int i = 0; i < 4; i++) {
            Recipe r = new Recipe();
            r.setName("recipe" + i);
            recipeBook.addRecipe(r);
        }
        Recipe overFlowRecipe = new Recipe();
        overFlowRecipe.setName("Extra");
        assertEquals(false, recipeBook.addRecipe(overFlowRecipe));
    }

    @Test
    @DisplayName("Delete recipe returns its name when present")
    void testDeleteRecipeSuccess() {
        recipeBook.addRecipe(coffee);
        assertEquals("Coffee", recipeBook.deleteRecipe(0));
    }

    @Test
    @DisplayName("Delete recipe returns null when slot empty")
    void testDeleteRecipeFromEmptySlot() {
        assertEquals(null, recipeBook.deleteRecipe(0));
    }

    @Test
    @DisplayName("Replace recipe returns old name when present")
    void testReplaceRecipeSuccess() {
        recipeBook.addRecipe(coffee);
        Recipe tea = new Recipe();
        tea.setName("Tea");
        assertEquals("Coffee", recipeBook.replaceRecipe(0, tea));
    }

    @Test
    @DisplayName("Replace recipe returns null when slot empty")
    void testReplaceRecipeFailsIfSlotEmpty() {
        Recipe tea = new Recipe();
        tea.setName("Tea");
        assertEquals(null, recipeBook.replaceRecipe(0, tea));
    }

    @Test
    @DisplayName("getRecipes should return an array where the first index Recipe name is coffee")
    public void testGetRecipes() {
        recipeBook.addRecipe(coffee);
        assertEquals(coffee.getName(), recipeBook.getRecipes()[0].getName());
    }

    @Test
    @DisplayName("Deleting recipe with invalid index throws ArrayIndexOutOfBoundsException")
    void testDeleteRecipeInvalidIndex() {
        RecipeBook book = new RecipeBook();
       
        assertEquals(null, book.deleteRecipe(4));
    }

    @Test
    @DisplayName("Replacing recipe with invalid index throws ArrayIndexOutOfBoundsException")
    void testReplaceRecipeInvalidIndex() {
        RecipeBook book = new RecipeBook();
        Recipe tea = new Recipe();
        tea.setName("Tea");

        assertEquals(null, book.replaceRecipe(4, tea));
    }


    @Test
    @DisplayName("Deleted recipe slot is not null, addRecipe fails after delete")
    void testDeleteRecipeLeavesSlotNonNull() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe coffee = new Recipe();
        coffee.setName("Coffee");

        coffeeMaker.addRecipe(coffee);

        coffeeMaker.deleteRecipe(0);

        Recipe tea = new Recipe();
        tea.setName("Tea");
        assertEquals(true, coffeeMaker.addRecipe(tea));
    }
    

}
