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
    //이름이 동일할 경우 true를 리턴하게 합니다.
    if(this == obj)
      return true;

    if(! (obj instanceof Owner owner))
      return false;

    return Objects.equals(this.name, owner.name);
  }

  @Override
  public String toString() {
    //이름은 OOO이고, 핸드폰 번호는 OOO-OOOO-OOOO입니다.
    StringBuilder sb = new StringBuilder();

    sb.append("이름은 ").append(this.name).append("이고 , 핸드폰 번호는 ").append(this.cellPhone).append("입니다.\n");
    return sb.toString();
  }
}
