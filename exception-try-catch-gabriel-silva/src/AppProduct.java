import java.util.Scanner;

import Class.Product;

public class AppProduct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Name: ");
      String name = sc.nextLine();

      System.out.println("Price: ");
      double price = sc.nextDouble();

      System.out.println("Quantity: ");
      int quantity = sc.nextInt();

      Product product = new Product(name, price, quantity);

      System.out.println(product.toString());
      
      sc.nextLine();

      System.out.println("New Name: ");

      String newName = sc.nextLine();

      System.out.println("New Price: ");
      double newPrice = sc.nextDouble();

      System.out.println("New Quantity: ");
      int newQuantity = sc.nextInt();

      product.setName(newName);
      product.setPrice(newPrice);
      product.setQuantity(newQuantity);
      System.out.println(product.toString());
    } catch (IllegalArgumentException error) {
      System.out.println("The data format is invalid: " + error.getMessage());
    } finally {
      sc.close();
    }
  }
}
