import Class.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person fulano = new Person("Fulano", 17);

        fulano.introduction(17);
        fulano.introduction(48);
        fulano.introduction(78);
        System.out.println("");

        fulano.introduction("Silva");
        System.out.println("");
        
        fulano.introduction();

    }
}
