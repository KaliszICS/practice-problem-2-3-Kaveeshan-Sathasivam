import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void testZero() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   @Test
   void testPostive() {
      assertEquals(25*Math.PI, PracticeProblem.circleArea(5));
   }

   @Test
   void testEven() {
      assertEquals(9*Math.PI, PracticeProblem.circleArea(3));

   }

   @Test
   void testLarge() {
      assertEquals(10000*Math.PI, PracticeProblem.circleArea(100));
      
   }

   @Test
   void testDouble() {
      assertEquals(6.25*Math.PI, PracticeProblem.circleArea(2.5));
      
   }

   @Test
   void testZeroMinutes() {
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
    }

   @Test
   void testOnlyMinutes() {
      assertEquals("0 hours and 30 minutes", PracticeProblem.minutesToHours(30));
    }

   @Test
   void testExactlyOneHour() {
      assertEquals("1 hours and 0 minutes", PracticeProblem.minutesToHours(60));
    }

   @Test
   void testHoursAndMinutes() {
      assertEquals("1 hours and 15 minutes", PracticeProblem.minutesToHours(75));
    }

   @Test
   void testMultipleHours() {
      assertEquals("3 hours and 20 minutes", PracticeProblem.minutesToHours(200));
    }

   @Test
   void testNormalCase() {
      assertEquals(200.0, PracticeProblem.simpleInterest(1000, 10, 2));
    }

   @Test
   void testZeroPrincipal() {
      assertEquals(0.0, PracticeProblem.simpleInterest(0, 10, 5));
    }

   @Test
   void testZeroRate() {
      assertEquals(0.0, PracticeProblem.simpleInterest(1000, 0, 3));
    }

   @Test
   void testZeroYears() {
      assertEquals(0.0, PracticeProblem.simpleInterest(1000, 5, 0));
    }

   @Test
   void testDecimalResult() {
    assertEquals(150.0, PracticeProblem.simpleInterest(1500, 5, 2));
}

   @Test
    void testTypicalTriangle() {
      assertEquals(5.0, PracticeProblem.hypotenuse(3, 4));
    }

    @Test
    void testBothSidesZero() {
      assertEquals(0.0, PracticeProblem.hypotenuse(0, 0));
    }

    @Test
    void testOneSideZero() {
      assertEquals(5.0, PracticeProblem.hypotenuse(5, 0));
    }

    @Test
    void testAnotherTriangle() {
      assertEquals(13.0, PracticeProblem.hypotenuse(5, 12));
    }

    @Test
    void testEqualSides() {
      assertEquals(Math.sqrt(2), PracticeProblem.hypotenuse(1, 1));
    }

}
