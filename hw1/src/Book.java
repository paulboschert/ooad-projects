class Book extends Media {
  private String author;
  private final Integer SORT_KEY = 20;

  public Book(String title, String author) {
    super.setSortKey(SORT_KEY);
    this.title = title;
    this.author = author;
  }

  public final String getAuthor() {
    return author;
  }

  @Override
  public final String toString() {
    return getTitle() + " by " + getAuthor() + " [Book]";
  }

  public final int compareTo(Media media) {
    // if media isn't an instance of Book, sort this after
    if (!(media instanceof Book)) {
      return this.getSortKey().compareTo(media.getSortKey());
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
