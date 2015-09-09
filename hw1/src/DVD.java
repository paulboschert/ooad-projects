class DVD extends Media {
  private Integer year;
  private final Integer SORT_KEY = 10;

  public DVD(String title, int year) {
    super.setSortKey(SORT_KEY);
    this.title = title;
    this.year = new Integer(year);
  }

  public final Integer getYear() {
    return year;
  }

  @Override
  public final String toString() {
    return year + ": " + title + " [DVD]";
  }

  public final int compareTo(Media media) {
    // if media isn't an instance of DVD, sort this before
    if(!(media instanceof DVD)) {
      return this.getSortKey().compareTo(media.getSortKey());
    }
 
    // otherwise, cast to a DVD and do a better comparison
    DVD dvd = (DVD) media;
    
    // if the titles are the same, use the year to sort
    int compVal = this.title.compareTo(dvd.getTitle());
    if(compVal != 0) {
      return compVal;
    } else {
      return this.getYear().compareTo(dvd.getYear());
    }
  }
}
