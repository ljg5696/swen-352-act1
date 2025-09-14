package coffeemaker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;

import coffeemaker.domain.Inventory;
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
    
}
