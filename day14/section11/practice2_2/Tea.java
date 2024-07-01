package day14.section11.practice2_2;

public class Tea extends Beverage {
  static int amount;

  public Tea(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  public void calcPrice() {
    switch (super.getName()) {
      case "lemonTea" -> {
        super.price = 1500;
      }
      case "ginsengTea" -> {
        super.price = 2000;
      }
      case "redginsengTea" -> {
        super.price = 2500;
      }
    }
  }
}
