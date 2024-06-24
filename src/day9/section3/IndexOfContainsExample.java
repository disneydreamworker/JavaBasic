package day9.section3;

import java.util.Arrays;
import java.util.StringTokenizer;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    String subject = "자바 객체 프로그래밍 과목입니다.";

    //1 문제에서 "객체 프로그래밍" 문자열을 추출하여 저장하여 출력하세요.
    String[] result1 = subject.split("");

    for (int i = subject.indexOf("객"); i <= subject.indexOf("밍"); i++) {
      System.out.print(result1[i]);
    }
    System.out.println();
    //1.1
    String str1 = subject.substring(subject.indexOf('객'), subject.indexOf('밍') + 1);
    System.out.println(str1);

    //2. subject 문자열에서 "프로그래밍" 문자열의 첫 인덱스를 저장하여 "프로그래밍 과목입니다." 문자열을 추출하여 출력하세요.
    String str2 = subject.substring(subject.indexOf("프"));
    System.out.println(str2);
    
    //3. subject 문자열에서 "자바" 문자열이 있으면 " 자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요" 출력
    StringTokenizer st = new StringTokenizer(subject);
    boolean b = false;
    while (st.hasMoreTokens()) {
      if (st.nextToken().equals("자바")) {
        b = true;
      }
    }
    if (b) {
      System.out.println("자바 관련 과목이군요!");
    } else {
      System.out.println("자바와 관련 없는 과목이군요.");
    }

    //3.1
    if (subject.contains("자바")) {
      System.out.println("자바 관련 과목이군요!");
    } else {
      System.out.println("자바와 관련 없는 과목이군요.");
    }

    //4.
  }
}
