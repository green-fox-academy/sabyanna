import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibo;

  @Before
  public void setup() {
    fibo = new Fibonacci();
  }

  @Test
  public void TestWorksForFirstElement() {
    assertEquals(0, fibo.fib(1));
  }

  @Test
  public void TestWorksForSecondElement() {
    assertEquals(1, fibo.fib(2));
  }

  @Test
  public void TestWorksForThirdElement() {
    assertEquals(1, fibo.fib(3));
  }

  @Test
  public void TestWorksForFifthElement() {
    assertEquals(3, fibo.fib(5));
  }



}