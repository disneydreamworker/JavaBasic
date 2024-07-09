package day18;

import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
    String data1 = "김창완&정수민&김지훈";
    //문제1. & 토큰라이저 클래스를 사용하여 학생이름을 1 김창완 2 정수민 3 김지훈 으로 출력하세요
    StringTokenizer st = new StringTokenizer(data1, "&");
    int no = 0;
    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      no++;
      System.out.println(no + " " + token);
    }

    //문제 2. 결과 동일하게 split() 메소드를 이용하여 출력하세요

    String[] list = data1.split("&");
    int number = 0;
    for (String str : list) {
      number++;
      System.out.println(number + " " + str);
    }


  }

}
