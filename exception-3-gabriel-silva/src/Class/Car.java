package Class;

public class Car {
  private String model;
  private String brand;
  private int year;
  private double power;
  private Engine engine;


  public Car(String model, String brand, int year, double power, double cylinderCapacity, String fuel) {
    if(year <= 1900){
      throw new IllegalArgumentException("The year must be greater than 1990.");
    }

    if(power <= 0){
      throw new IllegalArgumentException("The power must be greater than 0.");
    }

    if(cylinderCapacity <= 0){
      throw new IllegalArgumentException("The cylinder capacity must be greater than 0.");
    }
    
    this.model = model;
    this.brand = brand;
    this.year = year;
    this.power = power;
    this.engine = new Engine(cylinderCapacity, fuel);
  } 

  public Engine getEngine() {
    return engine;
  }

  @Override
  public String toString() {
    return "===================================" + "\n" +
           "Modelo: " + this.model + "\n" +
           "Marca: " + this.brand + "\n" +
           "Ano: " + this.year + "\n" +
           "Potência: " + this.power + "\n" +
           "Tipo de combustível: " + this.engine.getFuel() + "\n";
  }

  
}