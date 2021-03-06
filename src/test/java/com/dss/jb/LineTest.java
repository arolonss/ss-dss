package com.dss.jb;

/**
 * @author arolonss
 *
 */
import static org.junit.Assert.assertFalse;
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
  private Line lFour = new Line(0, 0, 6, 7);
  private Line lFive = new Line(4, 3, 1, 1);
  private Line lSix = new Line(5, 4, 2, 2);
  /*
   * delta - the maximum delta between expected and actual for which both numbers
   * are still considered equal.
   */
  private static final double DELTA = 1e-15;

  @Test
  public void getSlopeTest() {

    assertEquals(1.5, lOne.getSlope(), DELTA);
    assertEquals(2.0, lTwo.getSlope(), DELTA);
    assertEquals(-2.0, lThree.getSlope(), DELTA);
    assertEquals(1.0, lFour.getSlope(), DELTA);
    assertEquals(-6.0, lFive.getSlope(), DELTA);

  }

  @Test
  public void getDistanceTest() {

    assertEquals(Math.sqrt(13.0), lOne.getDistance(), DELTA);
    assertEquals(Math.sqrt(5.0), lTwo.getDistance(), DELTA);
    assertEquals(Math.sqrt(80.0), lThree.getDistance(), DELTA);
    assertEquals(Math.sqrt(85.0), lFour.getDistance(), DELTA);
    assertEquals(Math.sqrt(13.0), lFive.getDistance(), DELTA);

  }

  @Test
  public void parallelToTest() {
    assertFalse(lOne.parallelTo(lTwo));
    assertFalse(lTwo.parallelTo(lOne));
    assertFalse(lThree.parallelTo(lFour));

    assertTrue(lFive.parallelTo(lSix));
  }

}
