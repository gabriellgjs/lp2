package Class;

public class Engine {
  private double cylinderCapacity;
  private String fuel;
  
  public Engine(double cylinderCapacity, String fuel) {
    if(cylinderCapacity <= 0){
      throw new IllegalArgumentException("The year must be greater than 1990.");
    }

    this.cylinderCapacity = cylinderCapacity;
    this.fuel = fuel;
  }

  public String getFuel() {
    return fuel;
  }

  


  
}
