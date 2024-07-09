package day18.assignment.string1;

import java.util.Scanner;

public class Prob2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("문자를 입력하세요 : " );
    String input = sc.nextLine().toUpperCase();
    StringBuilder sb = new StringBuilder(input);
    System.out.println(sb.reverse()); //GNIMMARGORP AVAJ 출력
  }
}
