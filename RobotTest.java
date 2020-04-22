

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RobotTest
{
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void RobotWalk_Test()
    {
        Robot robot1 = new Robot();
        robot1.setSpeed(5.0);
        robot1.RobotWalk("green");
        assertEquals(5.0, robot1.getSpeed(), 0.1);
        Robot robot2 = new Robot();
        robot2.setSpeed(5.0);
        robot2.RobotWalk("yellow");
        assertEquals(6.0, robot2.getSpeed(), 0.1);
        Robot robot3 = new Robot();
        robot3.setSpeed(5.0);
        robot3.RobotWalk("red");
        assertEquals(0.0, robot3.getSpeed(), 0.1);
    }
}

