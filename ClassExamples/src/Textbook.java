
public class Textbook extends Book {

  public String gradeLevel;
  
  public Textbook(String title, int totalPages, String gradeLevel) {
    super(title, totalPages);
    this.gradeLevel = gradeLevel;
  }
  
  /**
   * @return the gradeLevel
   */
  public String getGradeLevel() {
    return gradeLevel;
  }

  /**
   * @param gradeLevel the gradeLevel to set
   */
  public void setGradeLevel(String gradeLevel) {
    this.gradeLevel = gradeLevel;
  }
}
