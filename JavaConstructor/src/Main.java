//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Parvej",10,10 );
        Student student2 = new Student(student);
        System.out.println(student);
        System.out.println(student2);
    }
}