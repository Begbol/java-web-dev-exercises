package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer myComputer;

    @Before
    public void beforeTest(){
        myComputer = new Computer(3000, 5000, "2021");
    }

    @Test
    public void constructorSetsValuesTest(){
        assertEquals(3000, this.myComputer.getScreenWidth());
        assertEquals(5000, this.myComputer.getScreenHeight());
        assertEquals("2021", this.myComputer.getManufactureYear());
    }

    @Test
    public void processTwoPlusTwo() {
        int result = this.myComputer.processTwoPlusTwo();
        assertEquals(4, result);
    }
}
