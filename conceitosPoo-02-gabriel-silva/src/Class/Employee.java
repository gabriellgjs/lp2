package Class;

public abstract class Employee {
  protected String name;
  protected int age;
  protected double salary;
  public static int quantity = 0;

  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    quantity++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public abstract double getBonus();

  public String toString(){
    return(
      "Name: " + this.name +  " \n" +
      "Age: " + this.age + " \n" +
      "Salary: " + salary);
  }
  
}