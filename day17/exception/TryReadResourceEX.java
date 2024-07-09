package day17.exception;

public class TryReadResourceEX {

  public static void main(String[] args) {
    try (MyResource myResource = new MyResource("김수한무한도전광석화");

    ){
      String data = myResource.readOne();
      //에러 발생
      int value = Integer.parseInt(data);

    } catch (Exception e) {
      System.out.println("숫자가 아닙니다");
      e.getMessage();
    }
  }

}
