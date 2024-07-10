package day18.assignment.objectpractice;

import java.util.Objects;
import lombok.Setter;

@Setter
public class Vehicle{
  Owner owner = null;
  private int price;


  @Override
  public boolean equals(Object obj) {
    //동일한 owner이면 true를 리턴합니다.
    //객체의 주소값을 비교하므로 Object.equals() 메서드를 사용 (두 변수가 동일한 객체를 가르키는지);
    boolean b = this.owner == ((Vehicle)obj).owner; //owner1, owner2의 주소값을 비교

    if (b) {
      return true;
    } else {
      //Owner의 equals() 메서드를 호출 => 이름 문자열이 같으면 true
      b = this.owner.equals(((Vehicle)obj).owner);
      return b;
    }
  }

  @Override
  public String toString() {
    //소유주정보 : 이름은 OOO이고, 헨드폰 번호는 OOO-OOOO-OOOO입니다.
    //차량정보 : 가격은 OOO입니다.
    StringBuilder sb = new StringBuilder();
    sb.append("이름은 ").append(this.owner.getName()).append("이고 , 핸드폰 번호는 ").append(this.owner.getCellPhone()).append("입니다.\n");
    sb.append("차량정보 : 가격은 ").append(this.price).append("입니다.\n").append(super.toString());
    return sb.toString();
  }
}
