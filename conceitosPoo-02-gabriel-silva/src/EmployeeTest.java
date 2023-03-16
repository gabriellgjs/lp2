import Class.Employee;
import Class.Manager;
import Class.Seller;

public class EmployeeTest {
    public static void main(String[] args) throws Exception {
        Seller fulano = new Seller("fulano", 20, 1000.00, 0.05, 5000);
        Seller beltrano = new Seller("beltrano", 30, 2000.00, 0.05, 5000);
        Seller ciclano = new Seller("ciclano", 40, 3000.00, 0.05, 5000);
        Manager JohnDoe = new Manager("JohnDoe", 50, 4000.00, "Commercial");
        
        System.out.println(fulano.toString() + "Bonus:  " + fulano.getBonus() + "\n======");
        System.out.println(beltrano.toString() + "Bonus:  " + beltrano.getBonus() + "\n======");
        System.out.println(ciclano.toString() + "Bonus:  " + ciclano.getBonus() + "\n======"); 
        System.out.println(JohnDoe.toString() + "\nBonus:  " + JohnDoe.getBonus() + "\n======");
        System.out.println("We have " + Employee.quantity + " employees working here.");
    }
}
