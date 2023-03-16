import Class.GreatKiskadee;
import Class.Parrot;
import Class.Cow;
import Class.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        GreatKiskadee goodToSee = new GreatKiskadee("bird");
        Parrot loro = new Parrot("bird");
        Dog dogson = new Dog("doguinho");
        Cow mu = new Cow("mu");

        goodToSee.sound();
        loro.sound();
        dogson.sound();
        mu.sound();
    }
}
    