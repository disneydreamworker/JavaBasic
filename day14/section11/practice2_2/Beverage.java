package day14.section11.practice2_2;

public abstract class Beverage {

  protected int price;
  private String name;


  public Beverage() {
  }

  public Beverage(String name) {
    this.name = name;
  }

  public static void getSalesInfo(Beverage[] beverage) {
    for (int i = 0 ; i < beverage.length; i++) {
      System.out.println(i+1 + "번째 판매 음료는 " + beverage[i].getName() + "이며, 가격은 " + beverage[i].price);
    }
  }

  public static int getTotalPrice(Beverage[] beverage) {
    int totalPrice = 0;
    for (Beverage b : beverage) {
      totalPrice += b.price;
    }
    return totalPrice;
  }

  public abstract void calcPrice();

  public void print() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

