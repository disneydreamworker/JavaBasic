package day18.assignment.string3;

public class FindCharacters {


  public static void main(String[] args) {
    FindCharacters fc=new FindCharacters();
    int count=fc.countChar("Boys, be ambitious", 'b');
    System.out.println(count);

  }
  public int countChar(String str, char c) {
    // Method를 완성하세요...
    int count = 0; // 카운트
    char[] chars = str.toCharArray(); //String str을 알파벳 한 자리씩 배열로 저장

    for (char ch : chars) { //enhanced for
      if (ch == c) {
        count++;
      }
    }
    return count;
  }
}
