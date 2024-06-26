package day11.util;

import day11.dto.CarVO;

public class CarUtility {
  public void carPrint(CarVO car) {
    System.out.println(car.carName + "\t" + car.carOwner + "\t" + car.carPrice);
  }
}
