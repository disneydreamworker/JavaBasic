package day14.section1.practice2_2;

public class Coffee extends Beverage {

  static int amount = 0;

  public Coffee(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  public void calcPrice() {
    switch (super.getName()) {
      case "Americano" -> {
        super.price = 1500;
      }
      case "CafeLatte" -> {
        super.price = 2500;
      }
      case "Cappuccino" -> {
        super.price = 3000;
      }
    }
  }
}
