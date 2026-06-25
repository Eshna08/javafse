public class MVCTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setId("S101");
        student.setGrade("A");

        StudentView studentView = new StudentView();

        StudentController controller = new StudentController(student, studentView);

        controller.updateView();

        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
