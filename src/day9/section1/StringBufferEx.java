package day9.section1;

public class StringBufferEx {

  public static void main(String[] args) {
    // StringBuffer, StringBuilder 클래스는 문자열의 연산(연결,변경,수정)에 주로 활용

    //StringBuffer
    //String 클래스 +. concat(): 문자열을 이어 붙여서 사용함
    StringBuffer sb = new StringBuffer();
    sb.append("hello");
    sb.append("Stringbuffer");
    sb.append("nice meet you");
    sb.append("!!!");

    String result = sb.toString();
    System.out.println(result);  //내부적으로 버퍼(buffer)가 제공되어 문자열 연산을 제공하여 최종결과를 만들어 낼 때 사용.

    String str1 = "ABCDEFGHIJKLMN";
    StringBuffer sb1 = new StringBuffer(str1);
    System.out.println(sb1);
    String str2 = sb1.toString();
    String str3 = sb1.substring(3, 10);

    sb1.insert(2, "OPQRSTU");
    String str4 = sb1.toString();
    System.out.println(str4);

    sb1.delete(2, 16);
    String str5 = sb1.toString();
    System.out.println(str5);

    sb1.insert(sb1.length(), "OPQRSTU");
    String str6 = sb1.toString();
    System.out.println(str6);
    System.out.println(str6.length());  //길이
    System.out.println(sb1.capacity()); //용량
    System.out.println(sb1.reverse());// 거꾸로 출력

    //StringBuilder
    StringBuilder sb2 = new StringBuilder(str1);
    String s = sb2.append("OPQRSTU").toString();
    System.out.println("StringBuilder를 사용해서 문자열 Append하기 : " + s);

    s = sb2.delete(6, sb2.length()).toString();
    System.out.println("문자열 delete하기 : " + s);

    char[] c = {'a', 'b', 'c'};
    s = sb2.insert(sb2.length(), c).toString();
    System.out.println("CharSequence를 insert 하기 : " + s);

    System.out.println("String 길이 출력" + s.length());
    System.out.println("StringBuilder 문자열 반대로 출력 : " + sb2.reverse());
    System.out.println("StringBuilder의 용량 출력" + sb2.capacity());


  }

}
