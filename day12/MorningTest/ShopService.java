package day12.MorningTest;


public class ShopService {
  private ShopService(){}
  private static ShopService singleton = new ShopService();
  public static ShopService getInstace() {
    return singleton;
  }
}
