package day13.emp.exec;

import day13.emp.vo.Animal;
import day13.emp.vo.Cat;
import day13.emp.vo.Dog;

public class DogCatMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    Cat cat = new Cat();
    cat.eat();

    Animal x = new Cat();
    x.eat();

    x = new Dog();
    x.eat();

    Animal dog1 = new Cat();
    dog1.eat();
    

  }

}
