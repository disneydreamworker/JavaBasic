package day13.inheritance.vo;

public class Dog extends Animal {

  //Override (재정의) : 슈퍼클래스의 동일한 이름과 파라미터의 타입과 수까지 같은 메서드를 재정의하는 것
  public void eat() {
    System.out.println("멍멍하고 먹어요");
  }

}
