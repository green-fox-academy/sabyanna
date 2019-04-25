import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  Sum testCase;
  ArrayList myList;


  @Before
  public void setup(){
    testCase = new Sum();
    myList = new ArrayList();
  }


  @Test
  public void testWithList() {
    myList.add(10);
    myList.add(20);
    myList.add(5);
    assertEquals((Integer)35, testCase.sum(myList));
    assertNotEquals((Integer)20, testCase.sum(myList));
  }

  @Test
  public void NottestWithList() {
    myList.add(10);
    myList.add(20);
    myList.add(5);
    assertNotEquals((Integer)20, testCase.sum(myList));
  }



  @Test
  public void testWithEmptyList() {
    assertEquals((Integer)0, testCase.sum(myList));
  }

  @Test
  public void NotTestWithEmptyList() {
    assertNotEquals((Integer)1, testCase.sum(myList));
  }

  @Test
  public void testWithOneElementList() {
    myList.add(10);
    assertEquals((Integer)10, testCase.sum(myList));
  }

  @Test
  public void NotTestWithOneElementList() {
    myList.add(10);
    assertNotEquals((Integer)11, testCase.sum(myList));
  }

  @Test (expected = NullPointerException.class)
  public void testWithNullList() {
    myList.add(null);
    testCase.sum(myList);
  }




}