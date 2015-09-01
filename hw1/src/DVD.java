class DVD extends Media {
  private Integer year;

  public DVD(String title, int year) {
    this.title = title;
    this.year = new Integer(year);
  }

  public Integer getYear() {
    return year;
  }

  @Override
  public String toString() {
    return year + ": " + title + " [DVD]";
  }

  public int compareTo(Media media) {
    // if media isn't an instance of DVD, sort this before
    if(!(media instanceof DVD)) {
      return -1;
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
