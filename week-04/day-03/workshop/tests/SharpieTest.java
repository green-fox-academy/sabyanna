import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharpieTest {
  Sharpie sharpie;


  @Before
  public void setup() {
    sharpie = new Sharpie("yellow", 10, 11 );
  }

  @Test

  public void CheckColorConstructor() {
    assertEquals("yellow", sharpie.color);
  }

  @Test
  public void CheckWidthConstructor() {
    assertEquals(10, sharpie.width);
  }

  @Test
  public void CheckInkAmountConstructor() {
    assertEquals(11, sharpie.inkAmount);
  }

  @Test
  public void CheckUseMethod() {
    sharpie.use();
    assertEquals(10, sharpie.inkAmount);
  }

  @Test
  public void CheckIsUnUsable() {
    sharpie.inkAmount = 0;
    assertEquals(false, sharpie.isUsable());
  }

  @Test
  public void CheckIsUsable() {
    sharpie.inkAmount = 1;
    assertEquals(true, sharpie.isUsable());
  }



}