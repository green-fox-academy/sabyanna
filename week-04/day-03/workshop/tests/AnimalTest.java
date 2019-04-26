import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  Animal animal;

  @Before
  public void setUp() {
    animal = new Animal();
  }

  @Test
  public void TestEat() {
    animal.eat();
    assertEquals(49, animal.hunger);
  }

  @Test
  public void TestMultipleEating() {
    for (int i = 0; i < 5; i++) {
      animal.eat();
    }
    assertEquals(45, animal.hunger);
  }

  @Test
  public void TestDrink() {
    animal.drink();
    assertEquals(49, animal.thirst);
  }

  @Test
  public void TestMultipleDrink() {
    for (int i = 0; i < 5; i++) {
      animal.drink();
    }
    assertEquals(45, animal.thirst);
  }

  @Test
  public void TestPlay() {
    animal.play();
    assertEquals(51, animal.hunger);
    assertEquals(51, animal.thirst);
  }

  public void TestMultiPlay() {
    animal.play();
    animal.play();
    assertEquals(52, animal.hunger);
    assertEquals(52, animal.thirst);
  }



}