package day11.dao;

import day11.dto.CarVO;

public class CarDAO {
  public void carInsert(CarVO carVo) {
    //db 연결, insert SQL
    System.out.println(carVo.carName + " 모델을 DB에 저장합니다.");
    System.out.println(carVo.carName + "의 Car 정보가 DB에 저장되었습니다.");
  }

  public void carSelect(CarVO carVo){
    //select 명령어로 db의 정보를 찾아옴
    System.out.println("car 객체 정보가 조회되었습니다.");
  }
}
