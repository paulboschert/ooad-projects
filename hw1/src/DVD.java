class DVD extends Media {
  private int year;

  public DVD(String title, int year) {
    this.title = title;
    this.year = year;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return year + ": " + title + " [DVD]";
  }

  public int compareTo(DVD dvd) {
    System.out.println("this.year: " + this.year + ", dvd.getYear(): " + dvd.getYear()); 
    if(this.getYear() > dvd.getYear())
      return -1;
    else if (this.getYear() < dvd.getYear())
      return 1;
    else
      return this.title.compareTo(dvd.getTitle());
  }
}
