package Class;

public class Person {
  protected String name;
  protected int age;

  public Person(String name, int age) {
    if(age <= 0) {
      throw new Error("Age must be greater than 0");
    }
    this.name = name;
    this.age = age;
  }

  public void introduction(int age) {
    String myTalk = age < 18?
     "Hi. My name is " + this.name + " and I'm a " + age +" years old.": 
    (age > 18 &&  age < 60? 
      "Hello. My name is " + this.name + " and I'm a " + age +" years old.":
      "How are you?. My name is " + this.name + " and I'm a " + age +" years old."
     );

     System.out.println(myTalk);
  }

  public void introduction() {
    System.out.println("My name is " + this.name + ".");
  }

  public void introduction(String lastName) {
    System.out.println("My name is " + this.name + " " + lastName + ".");;
  }
} 