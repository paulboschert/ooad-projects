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
}
