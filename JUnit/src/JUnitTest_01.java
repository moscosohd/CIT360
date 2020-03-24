package jUnit;
import org.junit.*;
import static org.junit.Assert.*;

public class JUnitTest_01 {

    @Test
    public void test_Monthly() {
        System.out.println("Test if pricePerMonth is correct...") ;
        JUnitExample S = new JUnitExample(200,2) ;
        assertTrue(S.simpleDivision() == 100) ;
    }

    @Test
    public void test_monthlytwo() {
        System.out.println("Testing again...") ;
        JUnitExample S = new JUnitExample(200,4) ;
        assertFalse(S.simpleDivision() != 50) ;
    }

    @Test
    public void testConcatenate() {
        System.out.println("Testing word concatenation...") ;
        JUnitString test = new JUnitString();
        String fullWord = test.concatenate("Hello", "World");
        assertEquals("HelloWorld", fullWord);
        System.out.println();
    }

    @Test
    public void testNotSame() {
        System.out.println("Testing NotSame...") ;
        JUnitExample S = new JUnitExample(200) ;
        assertNotSame(null, S);
    }

    @Test
    public void testSame() {
        System.out.println("Testing Same...") ;
        JUnitExample S = new JUnitExample(400) ;
        assertSame(400, S);
    }

    @Test
    public void testNotNull() {
        System.out.println("Testing NotNull...") ;
        JUnitString test = new JUnitString("Hello World!");
        assertNotNull(test);
    }

    @Test
    public void testNull() {
        System.out.println("Testing Null...") ;
        JUnitExample S = new JUnitExample(null) ;
        assertNull(S);
    }

}
