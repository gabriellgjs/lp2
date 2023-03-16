package Class;

public final class  Seller extends Employee {
  private double comission;
  private double salesValue;

  public Seller(String name, int age, double salary, double comission, double salesValue) {
    super(name, age, salary);
    this.comission = comission;
    this.salesValue = salesValue;
  }

  public double getComission() {
    return comission;
  }

  public void setComission(double comission) {
    this.comission = comission;
  }

  public double getSalesValue() {
    return salesValue;
  }

  public void setSalesValue(double salesValue) {
    this.salesValue = salesValue;
  }

  @Override
  public double getBonus() {
    return this.salary += (this.salesValue  * this.comission);
  }

  @Override
  public String toString() {
    String generateString = 
      super.toString() + 
      "\n" + "Comission: " + this.comission + 
      "\n" + "Sales Value: " + this.salesValue+
      "\n";
    return generateString;
  }


}
