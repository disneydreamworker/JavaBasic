package day9.section1;

public class StringEx1 {

  public static void main(String[] args) {
    //chartAt()메소드를 이용해서 "자바 프로그래밍" 문자열에서 "프로그래밍"만 출력 ㄱㄱ
    //문자열 저장 -> for문 이용해서 문자를 해당 인덱스 를 지정해서 프로그래밍만 출력
    //"프"의 인덱스를 조회해서 직접 인덱스를 지정하지 않고 추출하도록 ㄱㄱ
    //charAt()문자를 문자열로 변환하여 concat()메소드로 문자열 생성 ㄱㄱ
    String str = "자바 프로그래밍";
    String result = "";
    int starNum = str.indexOf("프");
    for (int i = starNum; i < str.length(); i++) {
      char c = str.charAt(i);
      result = result.concat(String.valueOf(c));
      System.out.print(str.charAt(i));
    }
    System.out.println(result);
  }
}
