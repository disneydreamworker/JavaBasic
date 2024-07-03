package day15.assignment1;

public abstract class Animal {

  int speed; //속도 km/h
  double distance; //이동거리 km

  //생성자
  Animal(int speed){
    this.speed = speed;
  }

  //추상 메서드
  abstract void run(int hours);

  public double getDistance(){
    return distance;
  }
}
