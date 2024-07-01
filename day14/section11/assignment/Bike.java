package day14.section11.assignment;

public class Bike extends Wheeler{
  public Bike(int velocity, String carName, int wheelNumber) {
    super();
    this.velocity = velocity;
    this.carName = carName;
    this.wheelNumber = wheelNumber;
    System.out.println("자전거 : 바퀴 " + wheelNumber + "개 입니다.");
  }

  @Override
  public void speedUp(int speed) {
    if (speed + super.velocity > 40) {
      super.velocity = 40;
      System.out.println("자전거의 현재 속도는 40 입니다.");
    } else {
      super.velocity = speed + super.velocity;
      System.out.println("자전거의 현재 속도는 " + super.velocity + " 입니다.");
    }
  }

  @Override
  public void speedDown(int speed) {
    if (super.velocity - speed < 10) {
      super.velocity = 10;
      System.out.println("자전거의 최저속도위반으로 속도를 10 으로 올립니다.");
    } else {
      super.velocity = super.velocity - speed;
      System.out.println("자전거의 최저속도위반으로 속도를 " + super.velocity + "으로 올립니다.");
    }
  }
}
