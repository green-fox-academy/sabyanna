import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram anagram;
  String string1;
  String string2;

  @Before
  public void setUp() {
    anagram = new Anagram();
  }

  @Test
  public void comparingLength() {
    string1 = "kecske";
    string2 = "bab";
    assertFalse(anagram.compareLength(string1, string2));
  }

  @Test
  public void comparingTrueLength() {
    string1 = "kecske";
    string2 = "babbab";
    assertTrue(anagram.compareLength(string1, string2));
  }

  @Test
  public void isAnagramFalse() {
    string1 = "kecspe";
    string2 = "kecsee";
    assertFalse(anagram.isAnagram(string1, string2));
  }

  @Test
  public void isAnagramFalse2() {
    string1 = "kecske";
    string2 = "kecsee";
    assertFalse(anagram.isAnagram(string1, string2));
  }

  @Test
  public void isAnagramTrue() {
    string1 = "kecske";
    string2 = "ekscek";
    assertTrue(anagram.isAnagram(string1, string2));
  }


}