package day18.assignment.string3;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Prob1 {
  public static void main(String[] args) {
    Prob1 p = new Prob1();
    String addr = "서울시,강남구,봉은사로,SSGJavaBackend";
    String[] addrArr = p.split(addr, ',');
    System.out.println("배열 크기 : " + addrArr.length);
    for(int i=0; i<addrArr.length; i++){
      System.out.print(addrArr[i] + " ");
    }
  }

  public String[] split(String str, char separator){
    StringTokenizer st = new StringTokenizer(str, String.valueOf(separator));

/*    String[] addr = new String[st.countTokens()];

    for (int i =0;i<addr.length;i++){
      addr[i] = st.nextToken();
    }*/


    //stream 사용
    ArrayList<String> arr = new ArrayList<String>();

    while(st.hasMoreTokens()) {arr.add(st.nextToken());}

    String[] addr = arr.stream().toArray(String[]::new);

    return addr;
  }
}