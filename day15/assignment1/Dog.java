package day15.assignment1;

public class Dog extends Animal{
  //생성자 -> 슈퍼 클래스에 값 전달
  Dog (int speed) {
    super(speed);
  }

  //상속 오버라이딩
  //개는 시간 * 속력 /2 만큼의 거리
  @Override
  void run(int hours) {
    this.distance = (double) (hours * this.speed) / 2;
    /*double distance = (double) (super.getSpeed() * hours) / 2;
    super.setDistance(distance);
    System.out.printf("개의 이동거리= %.1f\n",super.getDistance());*/
  }

  public double getDistance(){return distance;}
}
