package Class;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    if(price <= 0 || quantity <= 0) {
      throw new IllegalArgumentException("The price or quantity entered cannot be negative values.");
    }

    if(name.trim().isEmpty() || name.length() < 3) {
      throw new IllegalArgumentException("The name cannot be blank or contain only spaces, it must have at least 3 characters.");
    }


    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(name.trim().isEmpty() || name.length() < 3) {
      throw new IllegalArgumentException("The name cannot be blank or contain only spaces, it must have at least 3 characters.");
    }

    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if(price <= 0) {
      throw new IllegalArgumentException("The price entered cannot be negative value.");
    }

    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    if(quantity <= 0) {
      throw new IllegalArgumentException("The quantity entered cannot be negative value.");
    }

    this.quantity = quantity;
  }

  public double calculateTotalValue(){
    double totalValue = this.price * this.quantity;
    return totalValue;
  }


  @Override
  public String toString() {
    return  "Name: " + this.name + "\n" +
            "Price: " + this.price + "\n" +
            "Quantity: " + this.quantity + "\n"; 
  }
}
