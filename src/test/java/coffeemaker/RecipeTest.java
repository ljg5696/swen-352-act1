package coffeemaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeemaker.domain.Recipe;
import coffeemaker.exceptions.RecipeException;

public class RecipeTest {

    private Recipe Pie;
    private Recipe Oth;
    private Recipe Cake;
    private Recipe Scone;

    @BeforeEach
    public void setUp(){


        Pie = new Recipe();
        Oth = new Recipe();
        Cake = new Recipe();
        Scone = new Recipe();
    }

    @AfterEach
    public void tearDown(){

        Pie = null;
        Oth = null;
        Cake = null;
        Scone = null;
    }

    @Test
    void setNameTest(){
        Pie.setName("Apple Pie recipe");
        String result = Pie.getName();
        assertEquals("Apple Pie recipe", result, "result should be Apple Pie recipe");
    }

    @Test 
    void setNullNameTest(){


        String msg = "Name must not be null";

       Exception exception = assertThrows(RecipeException.class,
       () -> Pie.setName(null));

       assertEquals(msg, exception.getMessage());
    }

   

    @Test
    void toStringTest(){
        Pie.setName("Apple pie recipe");
        String result = Pie.toString();
        assertEquals("Recipe{Apple pie recipe}", result);

    }

    @Test
    void equalHashCode(){

        Pie.setName("Pie");
        Oth.setName("Pie");

        int HashCode1 = Pie.hashCode();
        int HashCode2 = Oth.hashCode();
        assertAll("Group assertions"
        , () ->   assertEquals(HashCode1, HashCode2)
        , () ->   assertEquals(Pie.hashCode(), HashCode1)

        );
    }

   
    @Test
    void equalsTest(){

        Pie.setName("Pie");
        Oth.setName("Pie");
        Cake.setName("Cake");
        
        
        assertAll("Group assertions"
        
        , () -> assertEquals(true ,Pie.equals(Oth))
        , () -> assertEquals(false,Pie.equals(Cake))
        , () -> assertEquals(false, Cake.equals(Scone))

        );
    }

    

   

    // @Test
    // void equalTest(){

    //     boolean result = Pie.equals(Oth);
    //     assertEquals(true, result);

    // }
    @Test 
    void setPriceTest(){
        Pie.setPrice("15");
        int result = Pie.getPrice();

        assertEquals(15, result, "result should be price should be 15");

        

    }

    @Test
    void equalGotTest(){
        Pie.setName("Pie");
        Oth.setName("Pie");

        boolean result = Pie.getClass().equals(Oth.getClass());
        assertEquals(true, result);

    }
     

    @Test 
    void setCoffeeTest(){
        Pie.setAmtCoffee("30");
        int result = Pie.getAmtCoffee();

        assertEquals(30, result, "Units of cofffee should be price should be 30");

    }

    @Test 
    void setMilkTest(){
        Pie.setAmtMilk("70");
        int result = Pie.getAmtMilk();

        assertEquals(70, result, "Units of cofffee should be price should be 70");

        

    }

    @Test 
    void setSugarTest(){
        Pie.setAmtSugar("150");
        int result = Pie.getAmtSugar();

        assertEquals(150, result, "Units of cofffee should be price should be 150");

        

    }
    
    @Test 
    void setChocolateTest(){
        Pie.setAmtChocolate("40");
        int result = Pie.getAmtChocolate();

        assertEquals(40, result, "Units of cofffee should be price should be 40");

        

    }

    @Test
    void negativeIntegerTest(){

        RecipeException exception = (RecipeException) assertThrows(Exception.class,
        () -> Pie.setPrice("-15"));
        assertEquals("Price must be a positive integer", exception.getMessage());
    }
    
    @Test 
    void negativeCoffeeTest(){
        RecipeException exception = (RecipeException) assertThrows(Exception.class,
        () -> Pie.setAmtCoffee("-6"));
        assertEquals("Units of coffee must be a positive integer", exception.getMessage());
        
    }
    @Test 
    void negativeMilkTest(){
        RecipeException exception = (RecipeException) assertThrows(Exception.class,
        () -> Pie.setAmtMilk("-9"));
        assertEquals("Units of milk must be a positive integer", exception.getMessage());
        
    }

    @Test 
    void negativeSugarTest(){
        RecipeException exception = (RecipeException) assertThrows(Exception.class,
        () -> Pie.setAmtSugar("-6"));
        assertEquals("Units of sugar must be a positive integer", exception.getMessage());
        
    }

    @Test 
    void negativeChocolateTest(){
        RecipeException exception = (RecipeException) assertThrows(Exception.class,
        () -> Pie.setAmtChocolate("-20"));
        assertEquals("Units of chocolate must be a positive integer", exception.getMessage());
        
    }

    @Test
    void setPriceNonIntegerTest(){
        String msg = "Price must be a positive integer";

        Exception exception = assertThrows(RecipeException.class,
        () -> Pie.setPrice("badentry"));

        assertEquals(msg, exception.getMessage());

    }

    @Test
    void setCoffeeNonIntegerTest(){
        String msg = "Units of coffee must be a positive integer";

        Exception exception = assertThrows(RecipeException.class,
        () -> Pie.setAmtCoffee("badentry"));

        assertEquals(msg, exception.getMessage());

    }

    @Test
    void setMilkNonIntegerTest(){
        String msg = "Units of milk must be a positive integer";

        Exception exception = assertThrows(RecipeException.class,
        () -> Pie.setAmtMilk("badentry"));

        assertEquals(msg, exception.getMessage());

    }
    
    @Test
    void setSugarNonIntegerTest(){
        String msg = "Units of sugar must be a positive integer";

        Exception exception = assertThrows(RecipeException.class,
        () -> Pie.setAmtSugar("badentry"));

        assertEquals(msg, exception.getMessage());

    }

    @Test
    void setChocolateNonIntegerTest(){
        String msg = "Units of chocolate must be a positive integer";

        Exception exception = assertThrows(RecipeException.class,
        () -> Pie.setAmtChocolate("badentry"));

        assertEquals(msg, exception.getMessage());

    }
}
