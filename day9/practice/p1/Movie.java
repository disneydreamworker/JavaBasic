package day9.practice.p1;

public class Movie{
  String title;
  String genre;

  public void setTitle(String title){
    this.title = title;
  }
  public void setGenre(String genre){
    this.genre = genre;
  }
  public void play(){
    System.out.println(this.title + "(" + this.genre +") 상영중입니다.");
  }
}
