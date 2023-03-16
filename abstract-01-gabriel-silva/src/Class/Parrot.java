package Class;

public class Parrot extends Birds{

  public Parrot(String nameParrot) {
    super(nameParrot);
  }
  
  @Override
  public void sound() {
    System.out.println("lorô");
  }
}
