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
    return getTitle() + " by " + getAuthor();
  }

  public int compareTo(Book book) {
    if(author.compareTo(book.getAuthor()) == 0)
      return this.title.compareTo(book.getTitle());
    else
      return author.compareTo(book.getAuthor());
  }
}
