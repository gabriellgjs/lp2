package Class;

public final class Manager extends Employee {
  private String department;

  public Manager(String name, int age, double salary, String department) {
    super(name, age, salary);
    this.department = department;
  }
  
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  @Override
  public double getBonus() {
    return this.salary += this.salary * 0.10;
  }
}
