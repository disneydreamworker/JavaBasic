package day14.section1.practice2;

public class Coffee extends Beverage{
  static int amount = 0;

  public Coffee(String name) {
    super(name);
    amount++;
  }

  @Override
  public void calcPrice() {

  }
}
