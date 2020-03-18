public class Student {
    private int rating;
    private String name;

    public static int count = 0;
    public static int countRating = 0;

    public Student(String name, int rating) {
        this.rating = rating;
        this.name = name;
        count++;
        countRating += rating;
    }

    public Student() {
        count++;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mykola", 15);
        Student student2 = new Student("Oleksandr", 5);
        Student student3 = new Student("Alex", 50);

        System.out.println(getAvgRating());
        student1.changeRating(99);
        System.out.println(getAvgRating());
    }

    public static double getAvgRating() {
        if (countRating == 0) {
            return 0;
        } else
            return (double) countRating / count;
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
        countRating += rating;
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {
        countRating -= this.rating;
        setRating(rating);
    }

    public static void removeStudent(Student student) {
        count--;
        countRating -= student.rating;
    }

    @Override
    public String toString() {
        return name + "," + rating;
    }
}