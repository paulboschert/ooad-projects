abstract class Media implements Comparable<Media> {
  protected String title;

  public String getTitle() {
    return title;
  }
  
  public int compareTo(Media media) {
    System.out.println(this.getClass());
    System.out.println(media.getClass());
    return this.title.compareTo(media.getTitle());
  }

  public int compareTo(DVD dvd) {
    // TODO Auto-generated method stub
    return 0;
  }

  public int compareTo(Book book) {
    // TODO Auto-generated method stub
    return 0;
  }
}
