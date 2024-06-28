package day13.inheritance.vo;

import javax.print.attribute.standard.DocumentName;

public class DogCatMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    Animal x = new Dog();
    x.eat();
  }
}
