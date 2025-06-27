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

   @Test
    public void testSquare() {
        Square s = new Square(5);
        assertEquals(25, s.getArea());
        assertEquals(20, s.getPerimeter());
    }

    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle t = new IsoscelesRightTriangle(5);
        assertEquals(12.5, t.getArea());
        assertEquals(5 + 5 + Math.sqrt(50), t.getPerimeter());
    }
}
