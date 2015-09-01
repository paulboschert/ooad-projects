public class UserUtility {
  static String createUsername(String first, String last) {
    first = first.toLowerCase();
    last = last.toLowerCase();
    /* return the concatenation of up to the first two characters of the first
     * name and up to the first two characters of the last name
     */
    return first.substring(0, Math.min(first.length(), 2))
        + last.substring(0, Math.min(last.length(), 2));
  }

  public static void main(String[] args) {
    System.out.println(createUsername("Liz", "Boese"));
    System.out.println(createUsername("L", "Boese"));
    System.out.println(createUsername("Liz", "B"));
    System.out.println(createUsername("", ""));
  }
}
