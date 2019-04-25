import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram anagram;

  @Before
  public void setup(){
    anagram = new Anagram();
  }


  @Test
  public void testTrueForIsAnagram() {
    assertEquals(true, anagram.isAnagram("anna", "anna"));
  }

  @Test
  public void testFalseForIsAnagram() {
    assertEquals(false, anagram.isAnagram("ann", "anna"));
  }


}