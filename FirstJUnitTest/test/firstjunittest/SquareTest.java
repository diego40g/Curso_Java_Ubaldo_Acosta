package firstjunittest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User-PC
 */
public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of area method, of class Square.
     */
    @Test
    public void testArea() {
        Square s = new Square(2);
        double expected=4;
        double actual=s.area();
        assertEquals(expected, actual, 0.0001);
    }

    /**
     * Test of setSideLength method, of class Square.
     */
    @Test
    public void testSetSideLength() {
    }
    
}
