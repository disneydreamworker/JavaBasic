package day17.exception.exceptionTest;

public class CellPhone {

  private final String model;
  private double battery = 0.0;

  public CellPhone(String model) {
    this.model = model;
  }

  public void call(int time) throws IllegalArgumentException {
    check(time);
    double usedBattery = time * 0.5;
    System.out.println("통화 시간 : " + time + "분");
    battery = Math.max(battery - usedBattery, 0.0);

//    if (time < 0) {
//      throw new IllegalArgumentException("통화시간입력오류");
//    } else {
//      double usedBattery = time * 0.5;
//      System.out.println("통화 시간 : " + time + "분");
//      battery = Math.max(battery - usedBattery, 0.0);
//    }
  }

  public void charge(int time) throws IllegalArgumentException {
    check(time);
    System.out.println("충전 시간 : " + time + "분");
    double chargedBattery = time * 3;
    battery = Math.min(battery + chargedBattery, 100);

//    if (time < 0) {
//      throw new IllegalArgumentException("충전시간입력오류");
//    } else {
//      System.out.println("충전 시간 : " + time + "분");
//      double chargedBattery = time * 3;
//      battery = Math.min(battery + chargedBattery, 100);
//    }
  }

  public void printBattery(){
    System.out.println("남은 배터리 양 : " + battery);
  }

  //exception check
  public void check(int time) {
    if (time < 0) {
      throw new IllegalArgumentException("충전시간입력오류");
    }
  }
}
