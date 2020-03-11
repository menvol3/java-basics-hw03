public class Student {
    private int rating;
    private String name;

    public static int count  = 0 ;
    public static int countRating  = 0 ;
    public Student(String name, int rating) {
        this.rating = rating;
        this.name = name;
        count ++;
        countRating += rating;
    }
    public Student() {count ++;
    }
  public static void main(String[] args) {
    Student student1 = new Student("Mykola", 15  );
    Student student2 = new Student("Oleksandr", 5);
    Student student3 = new Student("Alex", 50);

  }
    public static double getAvgRating() {

      return (double) countRating/count;
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
        countRating -= this.rating;
        countRating += rating;
        this.rating = rating;
    }
    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

  public void changeRating(int rating) {
     setRating(rating);
  }

  public static void removeStudent(Student student) {
        int n = Student.count;
        n = n - 1;
   }

    @Override
    public String toString() {
        return name + "," + rating;
    }
}
