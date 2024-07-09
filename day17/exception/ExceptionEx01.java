package day17.exception;

public class ExceptionEx01 {

  public static void main(String[] args) {
    printLengthString("null");
  }

  static void printLengthString(String data) {
    int result = 0;
    try {
      //1번 에러
      result = data.length();
      System.out.println("문자수 = " + result);
      //2번 에러
      Class.forName("Java.lang.String");
      System.out.println("String 클래스가 존재합니다.");

    } catch (NullPointerException e) {
//      System.err.println(e.getMessage());
      System.out.println(e.toString());
//      e.printStackTrace();
      System.out.println("예외 처리 완료!");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("String 클래스가 없습니다.");
    }

    finally {
      System.out.println("마무리 finally");
    }
  }
}
