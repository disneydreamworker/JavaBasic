package day18.assignment.string1;

public class Prob1 {

  public static void main(String[] args) {
    Prob1 pro = new Prob1();
    String answer1 = pro.leftPad("SSG", 6, '#');
    String answer2 = pro.leftPad("SSG", 5, '$');
    String answer3 = pro.leftPad("SSG", 2, '&');
    System.out.println(answer3);
  }

  public String leftPad(String str, int size, char padChar) {
    if (str.length() >= size) {
      return str;
    } else {
      StringBuilder sb = new StringBuilder(str);
      int end = size - str.length();
      for (int i = 0; i < end; i++) {
        sb.insert(0, padChar);
      }
      return sb.toString();
    }
  }
}

//insert(int dstOffset, CharSequence s, int start, int end)