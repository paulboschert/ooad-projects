abstract class Media implements Comparable<Media> {
  protected String title;
  protected Integer sortKey;

  public final String getTitle() {
    return title;
  }

  public final Integer getSortKey() {
    return sortKey;
  }

}
