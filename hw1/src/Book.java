class Book extends Media {
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }

  public String toString() {
    return getTitle() + " by " + getAuthor() + " [Book]";
  }

  public int compareTo(Media media) {
    // if media isn't an instance of Book, sort this after
    if (!(media instanceof Book)) {
      return 1;
    }

    // otherwise, cast to a Book and do a better comparison
    Book book = (Book) media;

    // if the titles are the same, use the author to sort
    int compVal = this.title.compareTo(book.getTitle());
    if (compVal != 0) {
      return compVal;
    } else {
      return this.getAuthor().compareTo(book.getAuthor());
    }
  }
}
