package clonable;

public class Student extends Person implements Cloneable{

  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, gender gender, String previousOrganization){
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    super();
    previousOrganization = "The school of Life";
    skippedDays = 0;
  }

  public Student clone() throws CloneNotSupportedException {

    return new Student(super.getName(), this.getAge(), this.getGender(), this.previousOrganization);
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }
}
