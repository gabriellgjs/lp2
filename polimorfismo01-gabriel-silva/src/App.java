import Class.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dogson = new Dog("doguinho");

        dogson.reaction("nice");
        dogson.reaction("agressive");

        System.out.println("");

        dogson.reaction(19, 00);
        dogson.reaction(11, 00);
        dogson.reaction(15, 00);

        System.out.println("");

        dogson.reaction(true);
        dogson.reaction(false);

        System.out.println("");

        dogson.reaction(1, 1.0);
        dogson.reaction(1, 11.0);
        dogson.reaction(6, 1.0);
        dogson.reaction(6, 11.0);
    }
}
    