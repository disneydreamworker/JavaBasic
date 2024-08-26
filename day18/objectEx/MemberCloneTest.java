package day18.objectEx;

public class MemberCloneTest {

  public static void main(String[] args) {
    Member member1 = new Member("ssg", 30, new Address(10101, "서울시 영등포구"));

    Member member2;
    try {
      member2 = member1.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("1 : " + member1);
    System.out.println("2 : " + member2);
    System.out.println(member1.getAd().getAdressOfAddress());
    System.out.println(member2.getAd().getAdressOfAddress());
//    1 : day18.objectEx.Address@448139f0
//    2 : day18.objectEx.Address@448139f0

//    Member member3;
//    try{
//      member3 = member1.clone();
//    } catch (CloneNotSupportedException e) {
//      throw new RuntimeException(e);
//    }
//
///*    System.out.println("1 : " + member1.getAd());
//    System.out.println("3 : " + member3.getAd());
//    System.out.println(member1.getAd().getAdressOfAddress());
//    System.out.println(member3.getAd().getAdressOfAddress());*/
  }
}
