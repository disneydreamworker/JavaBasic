package day13.inheritance.vo;

public class DogCatMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    Animal x = new Dog();
    x.eat();
  }
}
