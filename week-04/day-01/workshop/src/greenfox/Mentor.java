package greenfox;

public class Mentor extends Person {
  enum level {junior, intermediate, senior}

  private level level;

  public Mentor(String name, int age, gender gender, level level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = level.intermediate;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + level + "level mentor.");
  }

  public Mentor.level getLevel() {
    return level;
  }

  public void setLevel(Mentor.level level) {
    this.level = level;
  }
}
