package day16.homework.dto;

//Member 클래스(VO)
public abstract class MemberVo {

  public int id;
  public String name;
  public String job;

  public MemberVo() {
  }

  public MemberVo(int id, String name, String job) {
    this.id = id;
    this.name = name;
    this.job = job;
  }

  public abstract void memberInsert();

  public abstract void memberSearch();

  public abstract void memberUpdate(String job, int id);

  public abstract void memberDelete(int id);
}
