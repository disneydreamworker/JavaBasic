package day14.section1.practice2;

public class Tea extends Beverage{
  static int amount;

  public Tea(String name) {
    super(name);
    amount++;
  }

  @Override
  public void calcPrice() {

  }
}
