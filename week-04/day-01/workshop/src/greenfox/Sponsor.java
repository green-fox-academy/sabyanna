package greenfox;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, gender gender, String company){
    super(name, age, gender);
    this.company = company;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public String getCompany() {
    return company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }
}
