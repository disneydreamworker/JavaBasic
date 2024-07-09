package day18.objectEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address implements Cloneable {

  private int code;

  private String addr;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
