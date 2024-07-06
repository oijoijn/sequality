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
  public void testSumAndAverage() {
    int a = 2;
    int b = 3;
    int sum = a + b;
    double average = sum / 2.0;
    assertEquals(5, sum);
    assertEquals(2.5, average, 0.0);
  }

  @Test
  public void testSum1to10() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    double average = sum / 10.0;
    assertEquals(55, sum);
    assertEquals(5.5, average, 0.0);
  }

  @Test
  public void testSumOddAndEven1to10() {
    int sumOdd = 0;
    int sumEven = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sumEven += i;
      } else {
        sumOdd += i;
      }
    }
    assertEquals(25, sumOdd);
    assertEquals(30, sumEven);
  }
}
