package ApplicationControllerPattern;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractTest {

    public SubtractTest() {

    }

    @BeforeClass

    public static void setUpClass() {

    }

    @AfterClass

    public static void tearDownClass() {

    }

    @Test

    public void testExecute() {

        System.out.println("execute");

        Integer num1 = null;

        Integer num2 = null;

        Subtract instance = new Subtract();

        instance.execute(num1, num2);

        fail("The test case is a prototype.");

    }

}
