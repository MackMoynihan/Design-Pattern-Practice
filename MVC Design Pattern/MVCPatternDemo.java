/**
 * MVC Pattern driver class tests the model (Student.java), view (StudentView),
 * and controller (StudentController.java).
 *
 *
 *
 * @author      Mack Moynihan
 * @version     1.0
 * @since       11/14/2018
 */
public class MVCPatternDemo {
    public static void main(String[] args){
        Student student = retrieveStudentFromDatabase();
        StudentController controller = new StudentController(student);
        controller.updateView();
    }
    public static Student retrieveStudentFromDatabase(){
        return new Student("John Smith", "510");
    }
}
