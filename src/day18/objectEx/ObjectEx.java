package day18.objectEx;

class MyObject implements Cloneable {

  private String name;
  private int age;

  @Override
  protected MyObject clone() throws CloneNotSupportedException {
    try {
      return (MyObject) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }

  }
}

public class ObjectEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    MyObject myObject = new MyObject();
    System.out.println(myObject.toString());   //myObject 객체의 자신의 정보를 문자열로 반환
    MyObject copyObject = myObject.clone();
    System.out.println(myObject);
    System.out.println(copyObject);

  }

}
