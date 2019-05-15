import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberConverterTest {
  NumberConverter numberConverter;

  @Before
  public void setUp() {
    numberConverter = new NumberConverter();
  }

  @Test
  public void nine() {
    int number = 9;
    String expected = "nine";

    assertEquals(expected, numberConverter.convert(number));
  }

  @Test
  public void ninetyOne() {
    int number = 91;
    String expected = "ninety-one";

    assertEquals(expected, numberConverter.convert(number));
  }

  @Test
  public void twenty() {
    int number = 20;
    String expected = "twenty";

    assertEquals(expected, numberConverter.convert(number));
  }

  @Test
  public void hundredAndOne() {
    int number = 100;
    String expected = "hundred and one";

    assertEquals(expected, numberConverter.convert(number));
  }


  @Test
  public void twoHundredNinetyOne() {
    int number = 291;
    String expected = "two hundred and ninety-one";

    assertEquals(expected, numberConverter.convert(number));
  }

  @Test
  public void getIntIndex() {
    int place = 0;
    numberConverter.stringNumber = "91";
    int expected = 1;

    assertEquals(expected, numberConverter.getIntIndex(place));
  }




}
