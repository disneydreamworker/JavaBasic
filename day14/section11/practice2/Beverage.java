package day14.section11.practice2;

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
      switch (beverage[i].getName()) {
        case "Americano", "lemonTea" : beverage[i].price = 1500; break;
        case "ginsengTea" : beverage[i].price = 2000; break;
        case "CafeLatte", "redginsengTea" : beverage[i].price = 2500; break;
        case "Cappuccino" : beverage[i].price = 3000; break;
      }

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

