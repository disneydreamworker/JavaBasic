package day14.section1.assignment;

public class Truck extends Wheeler {

  public Truck(int velocity, String carName, int wheelNumber) {
    super();
    this.velocity = velocity;
    this.carName = carName;
    this.wheelNumber = wheelNumber;
    System.out.println("트럭 : 바퀴 " + wheelNumber + "개 입니다.");
  }

/*  speedUp(int speed)
: speeed의 5배만큼 velocity에 더하여 속도
  증가하는 메서드. 단, 최고속도 100을 초과
  하면 속도는 100으로 낮추고 출력결과처럼
  출력하도록 overriding한다.
  speedDown(int speed)
: speeed의 5배만큼 velocity에서 빼고 속도
  감소하는 메서드. 단, 최저속도 50 미만인
  경우에는 속도는 50으로 올리고 출력결과처
  럼 출력하도록 overriding한다.*/

  @Override
  public void speedUp(int speed) {
    if (speed * 5 > 100) {
      super.velocity = 100;
      System.out.println("트럭의 현재 속도는 100 입니다.");
    } else {
      super.velocity = speed * 5;
      System.out.println("트럭의 현재 속도는 " + super.velocity + " 입니다.");
    }
  }

  @Override
  public void speedDown(int speed) {
    if (super.velocity - (speed * 5) < 50) {
      super.velocity = 50;
      System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
    } else {
      super.velocity = super.velocity - (speed * 5);
      System.out.println("트럭의 최저속도위반으로 속도를" + super.velocity + " 으로 올립니다.");
    }
  }
}
