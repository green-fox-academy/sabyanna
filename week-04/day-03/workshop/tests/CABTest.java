import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CABTest {
  CAB cab;

  @Before
  public void setUp() {
    cab = new CAB();
  }

  @Test
  public void testGetGoal() {
    cab.goalInt = 1234;
    ArrayList test = new ArrayList();
    test.add("1");
    test.add("2");
    test.add("3");
    test.add("4");
    assertEquals(test, cab.getGoal(1234));
  }

  @Test
  public void testCorrectGuess() {
    assertEquals("Cows: 4, Bulls: 0", cab.guess("1234"));
  }

  @Test
  public void testNotCorrectGuess() {
    assertNotEquals("Cows: 4, Bulls: 0", cab.guess("1111"));
  }

  @Test
  public void testOneCowGuess() {
    assertEquals("Cows: 1, Bulls: 0", cab.guess("1000"));
  }

  @Test
  public void testOneCowOneBullGuess() {
    assertEquals("Cows: 1, Bulls: 1", cab.guess("1300"));
  }

  @Test
  public void testTwoCowTwoBullGuess() {
    assertEquals("Cows: 2, Bulls: 2", cab.guess("1243"));
  }


}