package day17.exception;

public class ExceptionEx02 {

  public static void main(String[] args) {
    String[] array = {null, "T", "H", "I", "S", "I", "S", "M", "E"};

    for (String a : array) {
      System.out.print(a);
    }

    System.out.println();

    try {
      for (int i = 0; i < 10; i++) {
        System.out.println(array[i]);
        int value = Integer.parseInt(array[i]);
        System.out.println("array[" + i + "] : " + value);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    } catch (NullPointerException | NumberFormatException e) {
      System.err.println(e.getMessage());
      e.printStackTrace();
    }
      System.out.println("프로그램 안전 종료");
  }
}
