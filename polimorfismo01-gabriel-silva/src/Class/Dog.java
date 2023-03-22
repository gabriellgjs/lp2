package Class;

public class Dog extends Mammal{
  public Dog(String nameDog) {
    super(nameDog);
  }

 @Override
  public void sound() {
    System.out.println("au au!");
  }
  

  public void reaction(String phrase) {
    if(!(phrase.equals("nice") || phrase.equals("agressive"))) {
      return;
    }

    String isReactionDog = phrase.equals("nice")?
      "the dog is wagging its tail"
      : "the dog is growling!";

    System.out.println(isReactionDog);
  }

  public void reaction(int hour, int minute) {
    if(hour < 0 || hour > 23 || minute < 0 || minute > 59) {
      return;
    }

    String isReactionDog;

    if(hour > 18) {
      isReactionDog = "the dog is ignoring.";
      System.out.println(isReactionDog);
      return;
    }
    
    if(hour > 12 & hour < 18) {
      isReactionDog = "the dog is barking.";
      System.out.println(isReactionDog);
      return;
    }

    isReactionDog = "the dog is wagging its tail";
    System.out.println(isReactionDog);
  }

  public void reaction(boolean owner) {
    String isReactionDog = owner?
      "the dog is wagging its tail"
      : "the dog is growling!";

    System.out.println(isReactionDog);
  }

  public void reaction(int age, double weight) {
    if(age < 0 || weight < 0){
      return;
    }

    String isReactionDog;
    String isHeavyDog = weight > 10? "heavy" : "no heavy";
    String isOldDog = age > 5? "old" : "no old";

    if(isHeavyDog.equals("heavy") && isOldDog.equals("old")){
      isReactionDog = "the dog is ignoring.";
      System.out.println(isReactionDog);
      return;
    }

    if(isHeavyDog.equals("heavy") && isOldDog.equals("no old")){
      isReactionDog = "the dog is growling!";
      System.out.println(isReactionDog);
      return;
    }
    if(isHeavyDog.equals("no heavy") && isOldDog.equals("no old")){
      isReactionDog = "the dog is wagging its tail.";
      System.out.println(isReactionDog);
      return;
    }
    if(isHeavyDog.equals("no heavy") && isOldDog.equals("old")){
      isReactionDog = "the dog is barking.";
      System.out.println(isReactionDog);
    }
  }
}

