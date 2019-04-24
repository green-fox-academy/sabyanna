package clonable;

public class Person {
  enum gender {male, female}

  private String name;
  private int age;
  private gender gender;


  public Person(String name, int age, gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;


  }

  public Person() {
    name = "Jane Doe";
    age = 30;
    this.gender = gender.female;
  }
  /*

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

   */

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Person.gender getGender() {
    return gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(Person.gender gender) {
    this.gender = gender;
  }
}
