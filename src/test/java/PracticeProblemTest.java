import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.lang.reflect.Method;

public class PracticeProblemTest {

   @Test
   @DisplayName("hasCapital returns true when string contains a capital letter")
   void hasCapitalTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("hasCapital", cArg);
         assertEquals(true, (boolean) method.invoke(null, "Hello"));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("hasCapital returns false when string has no capital letters")
   void hasCapitalTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("hasCapital", cArg);
         assertEquals(false, (boolean) method.invoke(null, "hello"));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("hasCapital returns false for an empty string")
   void hasCapitalTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("hasCapital", cArg);
         assertEquals(false, (boolean) method.invoke(null, ""));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("hasCapital returns true when all characters are capital")
   void hasCapitalTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("hasCapital", cArg);
         assertEquals(true, (boolean) method.invoke(null, "HELLO"));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // --- isPrime tests ---

   @Test
   @DisplayName("isPrime returns true for a known prime number")
   void isPrimeTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPrime", cArg);
         assertEquals(true, (boolean) method.invoke(null, 7));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPrime returns false for a non-prime number")
   void isPrimeTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPrime", cArg);
         assertEquals(false, (boolean) method.invoke(null, 9));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPrime returns false for 1, which is not prime")
   void isPrimeTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPrime", cArg);
         assertEquals(false, (boolean) method.invoke(null, 1));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPrime returns true for 2, the smallest prime")
   void isPrimeTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPrime", cArg);
         assertEquals(true, (boolean) method.invoke(null, 2));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }
}
