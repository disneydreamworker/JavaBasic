package day18.assignment.objectpractice;

import java.util.Objects;
import lombok.Setter;

@Setter
public class Vehicle implements Cloneable{
  Owner owner = null;
  private int price;


  @Override
  public boolean equals(Object obj) {
    //동일한 owner이면 true를 리턴합니다.
    if (this == obj) return true;

    if(!(obj instanceof Vehicle)) {
      return false;
    }

    Vehicle vehicle = (Vehicle) obj;
    return Objects.equals(this.owner, vehicle.owner);
  }

  @Override
  public String toString() {
    //소유주정보 : 이름은 OOO이고, 헨드폰 번호는 OOO-OOOO-OOOO입니다.
    //차량정보 : 가격은 OOO입니다.
    StringBuilder sb = new StringBuilder();
    sb.append("이름은 ").append(this.owner.getName()).append("이고 , 핸드폰 번호는 ").append(this.owner.getCellPhone()).append("입니다.\n");
    sb.append("차량정보 : 가격은 ").append(this.price).append("입니다.\n");
    return sb.toString();
  }
}
