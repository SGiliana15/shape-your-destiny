package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // You can write your unit tests here.
  @Test
  void appWorks() {
    assertEquals(true, true);
  }
  @Test
  public void testCircle() {
      Circle c = new Circle(5.0);
      assertEquals(78.5398, c.getArea(), 0.001);
      assertEquals(31.4159, c.getPerimeter(), 0.001);
    }

  @Test
  public void testRectangle() {
      Rectangle r = new Rectangle(4.0, 6.0);
      assertEquals(24.0, r.getArea());
      assertEquals(20.0, r.getPerimeter());
    }

  @Test
  public void testRightTriangle() {
      RightTriangle t = new RightTriangle(3.0, 4.0);
      assertEquals(6.0, t.getArea());
      assertEquals(12.0, t.getPerimeter());
    }
}
