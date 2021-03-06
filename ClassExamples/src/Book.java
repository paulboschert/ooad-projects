public class Book implements Media {

  private String title;
  private int pageCount;
  private int currentPage;
  
  public Book(String title, int pageCount) {
    this.title = title;
    this.pageCount = pageCount;
    this.currentPage = 1;
  }

  public void setPage(int page) {
    this.currentPage = page;
  }

  public void nextPage() {
    setPage(this.currentPage + 1);
  }

  public void setRandomStartPosition() {
    setPage(Math.round(((float)Math.random() * (float)this.pageCount)));
  }

  public void restart() {
    setPage(1);
  }

  public String printCurrentPage() {
    return "Current Page: " + this.currentPage;
  }

  public String toString() {
    return "Book Name: " + this.title + "\n" +
           "Total Pages: " + this.pageCount;
  }
}
