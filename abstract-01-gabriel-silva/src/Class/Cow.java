package Class;

public class Cow extends Mammal{
  public Cow(String nameCow) {
    super(nameCow);
  }

  @Override
  public void sound() {
    System.out.println("mu");
  }
  
}
