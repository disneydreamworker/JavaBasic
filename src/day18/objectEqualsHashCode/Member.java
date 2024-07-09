package day18.objectEqualsHashCode;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

  private int memberCode;
  String name;

  @Override
  public boolean equals(Object o) {
    if (o instanceof Member m) {
      if (this.memberCode == m.getMemberCode() && this.name.equals(m.getName())) {
        return true;
      }
    }
    return false;
  }

  
}
