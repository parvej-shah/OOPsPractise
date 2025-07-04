public class Student {
    private String studentName;
    private int studentID;
    private int grade;

    public Student(String studentName, int grade, int studentID) {
        if (grade<0){
            throw new IllegalArgumentException("Grade must be a positive number");
        }
        if (studentID<=0 || studentID>100){
            throw new IllegalArgumentException("Student ID must be a positive number");
        }
        this.studentName = studentName;
        this.grade = grade;
        this.studentID = studentID;
    }
    public Student(Student student) {
        this(student.studentName, student.studentID, student.grade);
    }
    public Student() {
        this(null, -1, -1);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + studentName + '\'' +
                ", ID=" + studentID +
                ", Grade=" + grade +
                '}';
    }
}
