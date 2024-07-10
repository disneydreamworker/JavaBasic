package day18.assignment.objectpractice;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Owner{
  private String name;
  private String cellPhone;

  @Override
  public boolean equals(Object obj) {
    //이름이 동일할 경우 true를 리턴하게 합니다. => String 클래스의 equal() 메서드를 사용
    //Owner 클래스의 name 멤버에 접근하기 위해 자동 업캐스팅 된 Object obj를 Owner로 다운캐스팅해서 name에 접근
    boolean b = (this.name.equals(((Owner) obj).name));
    return b;
  }

  @Override
  public String toString() {
    //이름은 OOO이고, 핸드폰 번호는 OOO-OOOO-OOOO입니다.
    StringBuilder sb = new StringBuilder();

    sb.append("이름은 ").append(this.name).append("이고 , 핸드폰 번호는 ").append(this.cellPhone).append("입니다.\n").append(super.toString());
    return sb.toString();
  }
}
