public class Student {
  private int rating;
  private String name;

  public Student(String name, int rating) {
    this.rating = rating;
    this.name = name;
  }

  public static void main(String[] args) {
    Student student1 = new Student("Viktor", 55);
    Student student2 = new Student("Petro" , 39);
    Student student3 = new Student("Pavlo", 78);
  }
  public static double getAvgRating() {

    return 0;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public boolean betterStudent(Student student) {
    // TODO return the result of comparing this.student's rating with the student's rating
    return false;
  }

  public void changeRating(int rating) {
    // TODO change this student's rating and average rating of all students
  }

  public static void removeStudent(Student student) {
    // TODO remove student
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return "";
  }
}
