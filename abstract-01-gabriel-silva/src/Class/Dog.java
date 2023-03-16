package Class;

public class Dog extends Mammal{
  public Dog(String nameDog) {
    super(nameDog);
  }

 @Override
  public void sound() {
    System.out.println("au au!");
  }
  
}
