package exercises.technology.tests;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop myLaptop;

    @Before
    public void beforeTest(){
        myLaptop = new Laptop(3000, 5000, "2021",true);
    }

    @Test
    public void constructorSetsValuesTest(){
        assertEquals(3000, this.myLaptop.getScreenWidth());
        assertEquals(5000, this.myLaptop.getScreenHeight());
        assertEquals("2021", this.myLaptop.getManufactureYear());
        assertEquals(true, this.myLaptop.getIsIntelliJOpened());
    }

    @Test
    public void openIntelliJSetsIntelliJOpenedToTrue(){
        this.myLaptop.setIsIntelliJOpened(false);
        assertEquals(false, this.myLaptop.getIsIntelliJOpened());
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.myLaptop.getIsIntelliJOpened());
    }
}
