import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LettersTest {
  Letters letters;

  @Before
  public void setUp(){
    letters = new Letters();
  }

  @Test
  public void worksOnEqualDictionary() {
    HashMap<String, Integer> test = new HashMap<>();
    test.put("A", 1);
    test.put("n", 2);
    test.put("a", 1);
    assertEquals(test, letters.dictionary("Anna"));
  }

  @Test
  public void worksOnNotEqualDictionary() {
    HashMap<String, Integer> test = new HashMap<>();
    test.put("A", 1);
    test.put("n", 2);
    test.put("a", 2);
    assertNotEquals(test, letters.dictionary("Anna"));
  }



}