/**
 * Controller class for MVC pattern. Student controller uses the model and
 * updates the view.
 *
 * @see         Student.java
 *
 * @author      Mack Moynihan
 * @version     1.0
 * @since       11/14/2018
 */
public class StudentController{
    private Student student;
    private StudentView studentView;

    public StudentController(Student student){
        this.student = student;
    }
    public void setStudentName(String name){
        if (student != null){
            student.setName(name);
        }
    }
    public String getStudentName(){
        if (student != null){
            return student.getName();
        }
        return null;
    }
    public void setStudentRollNo(String rollNo){
        if (student != null){
            student.setRollNo(rollNo);
        }
    }
    public String getStudentRollNo(){
        if (student != null){
            return student.getRollNo();
        }
        return null;
    }
    public void updateView(){
        studentView.printStudentDetails(student);
    }
}
