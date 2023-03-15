package Class;

public class Student extends Person {
  private int registration;
  private String course;

  public Student(String name, int age, int registration, String course) {
    super(name, age);
    this.registration = registration;
    this.course = course;
  }

  public int getRegistration() {
    return registration;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }
  
  public void showData() {
    System.out.println(
      "Name: " + getName() + "\n" +
      "Age: " + getAge() + "\n" +
      "Registration: " + getRegistration() + "\n" +
      "Course: " + getCourse() + "\n"
    );
  }

}
