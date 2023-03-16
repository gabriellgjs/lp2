package Class;

public abstract class Animal {
  protected String name;

  public Animal(String nameAnimal) {
    this.name = nameAnimal;
  }

  public void showName() {
    System.out.println("Name: " + getName());
  }

  public String getName() {
    return name;
  }

  public abstract void sound();
}
