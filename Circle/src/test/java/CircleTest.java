import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle circle;

    /*
     *  Negative Test Case for constructor
     *
     *  Check for invalid argument: Radius cannot be negative.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCircleFail() {
        circle = new Circle(-1);
    }

    /*
     * Create circle object
     */
    @Before
    public void setUp() {
        circle = new Circle(1);
    }

    /*
     * Clear circle object
     */
    @After
    public void tearDown() {
        circle = null;
    }

    /*
     * Positive Test Case for squareCircle()
     *
     * Check for true expected result: radius = 1, squareCircle should be equals "Math.PI".
     * Check for true expected result: radius = 0, squareCircle should be 0.
     */
    @Test
    public void testSquareCirclePass() {
        assertEquals(Math.PI, circle.squareCircle(), 0);
        circle = new Circle(0);
        assertEquals(0, circle.squareCircle(), 0);
    }

    /*
     * Negative Test Case for squareCircle()
     *
     * Check for false expected result: radius = 1, squareCircle shouldn't be 1000.
     */
    @Test
    public void testSquareCircleFail() {
        assertNotEquals(1000, circle.squareCircle(), 0);
    }

    /*
     * Positive Test Case for equalsCircle()
     *
     * Check for equals circles.
     */
    @Test
    public void testEqualsCirclePass() {
        Circle circle_2 = new Circle(1);
        assertTrue(circle.equalsCircle(circle_2));
    }

    /*
     * Negative Test Case for equalsCircle()
     *
     * Check for different circles
     */
    @Test
    public void testEqualsCircleFail() {
        circle = new Circle(1);
        Circle circle_2 = new Circle(2);
        assertFalse(circle.equalsCircle(circle_2));
    }

    /*
     * Negative Test Case for equalsCircle()
     *
     * Check for null argument: Circle can not be null.
     */
    @Test(expected = NullPointerException.class)
    public void testEqualsCircleToNullFail() {
        circle.equalsCircle(null);
    }
}
