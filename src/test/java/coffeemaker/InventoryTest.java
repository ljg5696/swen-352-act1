package coffeemaker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;

import coffeemaker.domain.Inventory;
import coffeemaker.domain.Recipe;
import coffeemaker.exceptions.InventoryException;

/**
 * Unit test class for the Inventory component
 */
public class InventoryTest {

    /**
     * Inventory object to be tested
     */
    private Inventory inventoryCuT;

    @BeforeEach
    void setUp() {
        inventoryCuT = new Inventory();
    }

    @AfterEach
    void tearDown() {
        inventoryCuT = null;
    }

    @Test
    @DisplayName("Test Case: Inventory Constructor")
    void testInventoryConstructor() {
        assertAll("Group assertions"
            , () -> assertEquals(15, inventoryCuT.getCoffee(), "coffee should be 15")
            , () -> assertEquals(15, inventoryCuT.getMilk(), "milk should be 15")
            , () -> assertEquals(15, inventoryCuT.getSugar(), "sugar should be 15")
            , () -> assertEquals(15, inventoryCuT.getChocolate(), "chocolate should be 15")
        );
    }

    @Test
    @DisplayName("Test Case: addCoffee('5')")
    void addCoffee1() {
        // execute test method
        inventoryCuT.addCoffee("5");
        int result = inventoryCuT.getCoffee();

        // validate the results
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Test Case: addMilk('5')")
    void addMilk1() {
        // execute test method
        inventoryCuT.addMilk("5");
        int result = inventoryCuT.getMilk();

        // validate the results
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Test Case: addSugar('5')")
    void addSugar1() {
        // execute test method
        inventoryCuT.addSugar("5");
        int result = inventoryCuT.getSugar();

        // validate the results
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Test Case: addChocolate('5')")
    void addChocolate1() {
        // execute test method
        inventoryCuT.addChocolate("5");
        int result = inventoryCuT.getChocolate();

        // validate the results
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Test Case: addCoffee('-5')")
    void addCoffeeExceptionTest() {
        // setup
        String msg = "Units of coffee must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addCoffee("-5"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }
    
    @Test
    @DisplayName("Test Case: addMilk('-5')")
    void addMilkExceptionTest() {
        // setup
        String msg = "Units of milk must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addMilk("-5"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }

    @Test
    @DisplayName("Test Case: addSugar('-5')")
    void addSugarExceptionTest() {
        // setup
        String msg = "Units of sugar must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addSugar("-5"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }

    @Test
    @DisplayName("Test Case: addChocolate('-5')")
    void addChocolateExceptionTest() {
        // setup
        String msg = "Units of chocolate must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addChocolate("-5"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }

    @Test
    @DisplayName("Test Case: addCoffee('badentry')")
    void addCoffeeExceptionTestNonInteger() {
        // setup
        String msg = "Units of coffee must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addCoffee("badentry"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }
    
    @Test
    @DisplayName("Test Case: addMilk('badentry')")
    void addMilkExceptionTestNonInteger() {
        // setup
        String msg = "Units of milk must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addMilk("badentry"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }

    @Test
    @DisplayName("Test Case: addSugar('badentry')")
    void addSugarExceptionTestNonInteger() {
        // setup
        String msg = "Units of sugar must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addSugar("badentry"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }

    @Test
    @DisplayName("Test Case: addChocolate('badentry')")
    void addChocolateExceptionTestNonInteger() {
        // setup
        String msg = "Units of chocolate must be a positive integer";
        
        // execute test method
        Exception exception = assertThrows(InventoryException.class,
            () -> inventoryCuT.addChocolate("badentry"));

        // validate the results
        assertEquals(msg, exception.getMessage());
    }

    @Test
    @DisplayName("Test Case: setCoffee(10)")
    void setCoffeePositive() {
        // execute test method
        inventoryCuT.setCoffee(10);
        int result = inventoryCuT.getCoffee();

        // validate the results
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Test Case: setCoffee(-10)")
    void setCoffeeNegative() {
        // execute test method
        inventoryCuT.setCoffee(-10);
        int result = inventoryCuT.getCoffee();

        // validate the results
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Test Case: setCoffee(0)")
    void setCoffeeZero() {
        // execute test method
        inventoryCuT.setCoffee(0);
        int result = inventoryCuT.getCoffee();

        // validate the results
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test Case: setMilk(10)")
    void setMilkPositive() {
        // execute test method
        inventoryCuT.setMilk(10);
        int result = inventoryCuT.getMilk();

        // validate the results
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Test Case: setMilk(0)")
    void setMilkZero() {
        // execute test method
        inventoryCuT.setMilk(0);
        int result = inventoryCuT.getMilk();

        // validate the results
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test Case: setMilk(-10)")
    void setMilkNegative() {
        // execute test method
        inventoryCuT.setMilk(-10);
        int result = inventoryCuT.getMilk();

        // validate the results
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Test Case: setSugar(10)")
    void setSugarPositive() {
        // execute test method
        inventoryCuT.setSugar(10);
        int result = inventoryCuT.getSugar();

        // validate the results
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Test Case: setSugar(-10)")
    void setSugarNegative() {
        // execute test method
        inventoryCuT.setSugar(-10);
        int result = inventoryCuT.getSugar();

        // validate the results
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Test Case: setSugar(0)")
    void setSugarZero() {
        // execute test method
        inventoryCuT.setSugar(0);
        int result = inventoryCuT.getSugar();

        // validate the results
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test Case: setChocolate(10)")
    void setChocolatePositive() {
        // execute test method
        inventoryCuT.setChocolate(10);
        int result = inventoryCuT.getChocolate();

        // validate the results
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Test Case: setChocolate(-10)")
    void setChocolateNegative() {
        // execute test method
        inventoryCuT.setChocolate(-10);
        int result = inventoryCuT.getChocolate();

        // validate the results
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Test Case: setChocolate(0)")
    void setChocolateZero() {
        // execute test method
        inventoryCuT.setChocolate(0);
        int result = inventoryCuT.getChocolate();

        // validate the results
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test Case: useIngredients() with enough stock")
    void useIngredientsTrue() {
        // setup
        Recipe testRecipe = new Recipe();
        testRecipe.setAmtCoffee("5");
        testRecipe.setAmtMilk("5");
        testRecipe.setAmtSugar("5");
        testRecipe.setAmtChocolate("5");

        // execute test method
        boolean result = inventoryCuT.useIngredients(testRecipe);

        // validate the results
        assertAll("Group assertions"
            , () -> assertEquals(true, result, "result should be true")
            , () -> assertEquals(10, inventoryCuT.getCoffee(), "coffee should be 10")
            , () -> assertEquals(10, inventoryCuT.getMilk(), "milk should be 10")
            , () -> assertEquals(10, inventoryCuT.getSugar(), "sugar should be 10")
            , () -> assertEquals(10, inventoryCuT.getChocolate(), "chocolate should be 10")
        );
    }

    @Test
    @DisplayName("Test Case: useIngredients() without enough stock")
    void useIngredientsFalse() {
        // setup
        Recipe testRecipe = new Recipe();
        testRecipe.setAmtCoffee("25");
        testRecipe.setAmtMilk("25");
        testRecipe.setAmtSugar("25");
        testRecipe.setAmtChocolate("25");

        // execute test method
        boolean result = inventoryCuT.useIngredients(testRecipe);

        // validate the results
        assertAll("Group assertions"
            , () -> assertEquals(false, result, "result should be false")
            , () -> assertEquals(15, inventoryCuT.getCoffee(), "coffee should be 15")
            , () -> assertEquals(15, inventoryCuT.getMilk(), "milk should be 15")
            , () -> assertEquals(15, inventoryCuT.getSugar(), "sugar should be 15")
            , () -> assertEquals(15, inventoryCuT.getChocolate(), "chocolate should be 15")
        );
    }

    @Test
    @DisplayName("Test Case: useIngredients() using all ingredients")
    void useIngredientsAll() {
        // setup
        Recipe testRecipe = new Recipe();
        testRecipe.setAmtCoffee("15");
        testRecipe.setAmtMilk("15");
        testRecipe.setAmtSugar("15");
        testRecipe.setAmtChocolate("15");

        // execute test method
        boolean result = inventoryCuT.useIngredients(testRecipe);

        // validate the results
        assertAll("Group assertions"
            , () -> assertEquals(true, result, "result should be true")
            , () -> assertEquals(0, inventoryCuT.getCoffee(), "coffee should be 0")
            , () -> assertEquals(0, inventoryCuT.getMilk(), "milk should be 0")
            , () -> assertEquals(0, inventoryCuT.getSugar(), "sugar should be 0")
            , () -> assertEquals(0, inventoryCuT.getChocolate(), "chocolate should be 0")
        );
    }

    @Test
    @DisplayName("Test Case: useIngredients() without enough coffee")
    void useIngredientsFalseCoffee() {
        // setup
        Recipe testRecipe = new Recipe();
        testRecipe.setAmtCoffee("16");
        testRecipe.setAmtMilk("15");
        testRecipe.setAmtSugar("15");
        testRecipe.setAmtChocolate("15");

        // execute test method
        boolean result = inventoryCuT.useIngredients(testRecipe);

        // validate the results
        assertAll("Group assertions"
            , () -> assertEquals(false, result, "result should be false")
            , () -> assertEquals(15, inventoryCuT.getCoffee(), "coffee should be 15")
            , () -> assertEquals(15, inventoryCuT.getMilk(), "milk should be 15")
            , () -> assertEquals(15, inventoryCuT.getSugar(), "sugar should be 15")
            , () -> assertEquals(15, inventoryCuT.getChocolate(), "chocolate should be 15")
        );
    }

    @Test
    @DisplayName("Test Case: useIngredients() without enough milk")
    void useIngredientsFalseMilk() {
        // setup
        Recipe testRecipe = new Recipe();
        testRecipe.setAmtCoffee("15");
        testRecipe.setAmtMilk("16");
        testRecipe.setAmtSugar("15");
        testRecipe.setAmtChocolate("15");

        // execute test method
        boolean result = inventoryCuT.useIngredients(testRecipe);

        // validate the results
        assertAll("Group assertions"
            , () -> assertEquals(false, result, "result should be false")
            , () -> assertEquals(15, inventoryCuT.getCoffee(), "coffee should be 15")
            , () -> assertEquals(15, inventoryCuT.getMilk(), "milk should be 15")
            , () -> assertEquals(15, inventoryCuT.getSugar(), "sugar should be 15")
            , () -> assertEquals(15, inventoryCuT.getChocolate(), "chocolate should be 15")
        );
    }

    @Test
    @DisplayName("Test Case: useIngredients() without enough sugar")
    void useIngredientsFalseSugar() {
        // setup
        Recipe testRecipe = new Recipe();
        testRecipe.setAmtCoffee("15");
        testRecipe.setAmtMilk("15");
        testRecipe.setAmtSugar("16");
        testRecipe.setAmtChocolate("15");

        // execute test method
        boolean result = inventoryCuT.useIngredients(testRecipe);

        // validate the results
        assertAll("Group assertions"
            , () -> assertEquals(false, result, "result should be false")
            , () -> assertEquals(15, inventoryCuT.getCoffee(), "coffee should be 15")
            , () -> assertEquals(15, inventoryCuT.getMilk(), "milk should be 15")
            , () -> assertEquals(15, inventoryCuT.getSugar(), "sugar should be 15")
            , () -> assertEquals(15, inventoryCuT.getChocolate(), "chocolate should be 15")
        );
    }

    @Test
    @DisplayName("Test Case: useIngredients() without enough chocolate")
    void useIngredientsFalseChocolate() {
        // setup
        Recipe testRecipe = new Recipe();
        testRecipe.setAmtCoffee("15");
        testRecipe.setAmtMilk("15");
        testRecipe.setAmtSugar("15");
        testRecipe.setAmtChocolate("16");

        // execute test method
        boolean result = inventoryCuT.useIngredients(testRecipe);

        // validate the results
        assertAll("Group assertions"
            , () -> assertEquals(false, result, "result should be false")
            , () -> assertEquals(15, inventoryCuT.getCoffee(), "coffee should be 15")
            , () -> assertEquals(15, inventoryCuT.getMilk(), "milk should be 15")
            , () -> assertEquals(15, inventoryCuT.getSugar(), "sugar should be 15")
            , () -> assertEquals(15, inventoryCuT.getChocolate(), "chocolate should be 15")
        );
    }

    @Test
    @DisplayName("Test Case: toString() all ingredients 15")
    void inventoryToString() {
        // setup
        String expected = "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n";
        
        // execute test method
        String result = inventoryCuT.toString();

        // validate the results
        assertEquals(expected, result);
    }
    
}
