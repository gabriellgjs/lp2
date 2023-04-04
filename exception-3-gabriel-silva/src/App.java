import java.util.Scanner;

import Class.Car;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Modelo: ");
            String model = sc.nextLine();
      
            System.out.println("Marca: ");
            String brand =  sc.nextLine();
      
            System.out.println("Ano: ");
            int year = sc.nextInt();

            System.out.println("Potência: ");
            double power = sc.nextDouble();

            System.out.println("Cilidradas: ");
            double cylinderCapacity = sc.nextDouble();

            sc.nextLine();
            
            System.out.println("Tipo de combustível: ");
            String fuelName = sc.nextLine();
      
            Car car1 = new Car(model, brand, year, power, cylinderCapacity, fuelName);
            System.out.println(car1.toString());
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
