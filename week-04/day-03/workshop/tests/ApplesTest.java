import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  Apples apple;

  @Before
  public void setup() {
    apple = new Apples();
  }

  @Test
  public void returnTest(){
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void notReturnTest(){
    assertNotEquals("apples", apple.getApple());
  }
}



