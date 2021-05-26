/**
 * 
 */
package com.dss.jb;





/**
 * @author main
 *
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LineTest {
  /*
   * Assignment 4 Create unit tests for the Line Class (see video).
   * 
   * Create a file called LineTest.java. Create tests for the getSlope,
   * getDistance, and parallelTo methods. Because of rounding errors, it is bad
   * practice to test double values for exact equality. To get around this, you
   * can pass a small value (such as .0001) to assertEquals to be used as a delta.
   */
  
    private Line lOne = new Line(1, 1, 3, 4);
    private Line lTwo = new Line(8, 7, 9, 9);
    private Line lThree = new Line(3, 6, 7, -2);
    private Line lFour = new Line(5, 5, 7, 7);

    /*delta - the maximum delta between expected 
    and actual 
    for which both numbers are still considered equal.
    */
    private static final double DELTA = 1e-15;

    @Test
    public void getSlopeTest() {
    // x0 1, y0 3, x1 1, y1 4 = 1 / 0  = 0
      assertEquals(1.0, lOne.getSlope(), DELTA);
      assertEquals(1.0, lTwo.getSlope(), DELTA);
    // 2 / 1 = 1 
    }

    @Test
    public void getDistanceTest() {

    }

    public void parallelToTest() {
      assertTrue(lOne.parallelTo(lTwo));
      assertTrue(lTwo.parallelTo(lOne));
      assertTrue(lThree.parallelTo(lFour));
      assertTrue(lFour.parallelTo(lThree));
    }

  
}
