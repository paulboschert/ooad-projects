
public class BookDriver {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Book javabook = new Book("Java Rules", 303);
    javabook.setPage(225);
    javabook.nextPage();
    javabook.setPage(600);
    javabook.nextPage();

  }

}
