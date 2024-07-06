/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testGetGreeting() {
    App app = new App();
    assertEquals("Hello World!", app.getGreeting());
  }

  @Test
  public void testSum() {
    Calculate Calculate = new Calculate();
    assertEquals(5, Calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate Calculate = new Calculate();
    assertEquals(2.5, Calculate.average(5, 2), 0.01);
  }

  @Test
  public void testSumRange() {
    Calculate Calculate = new Calculate();
    assertEquals(55, Calculate.sumRange(1, 10));
  }

  @Test
  public void testSumOdd() {
    Calculate Calculate = new Calculate();
    assertEquals(25, Calculate.sumOdd(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate Calculate = new Calculate();
    assertEquals(30, Calculate.sumEven(1, 10));
  }
}
