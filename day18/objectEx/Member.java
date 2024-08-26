package day18.objectEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member implements Cloneable{
  private String name;
  private int age;
  private Address ad; //Adress class 형을 가진 ad

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  protected Member clone() throws CloneNotSupportedException {
    //Member 클래스를 클론해서 리턴하는 메서드
    return (Member)super.clone();
  }


 /* @Override
  protected Member clone() throws CloneNotSupportedException {
    //Address clone
    Address clonedAddress = (Address)ad.clone();
    System.out.println("원본 address : " + this.ad);
    System.out.println("클론 address : " + clonedAddress);
    System.out.println("클론 address클래스의 address : " + clonedAddress.getAdressOfAddress());
    System.out.println("==================================================");
    //Member clone
    Member clonedMember = (Member)super.clone();
    clonedMember.setAd(clonedAddress);
    return clonedMember;
  }*/
}