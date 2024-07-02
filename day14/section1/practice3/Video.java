package day14.section1.practice3;

public class Video extends Content{
  private String genre;

  public Video() {
  }

  public Video(String title, String genre) {
    super();
    super.setTitle(title);
    this.genre = genre;
  }

  @Override
  public void totalPrice() {
    switch (genre) {
      case "new" : super.setPrice(2000); break;
      case "comic" : super.setPrice(1500); break;
      case "child" : super.setPrice(1000); break;
      default : super.setPrice(500);
    }
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
