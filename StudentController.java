import java.util.ArrayList;


public class StudentController implements UserController<Student> {

    StudentGroup students = new StudentGroup(new ArrayList<>());
    UserView<Student> userView = new UserView<Student>();

   @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxID = 0;
        if (!students.getStudentList().isEmpty()) {
            maxID = students.getStudentList().get(students.getStudentList().size() - 1).getStudentId() + 1;
        }
        Student student = new Student(maxID, firstName, secondName, lastName);
        students.addStudent(student);
    }

    
    void printStudentList() {
        userView.sendOnConsole(students.getStudentList());
    }


    @Override
    public String toString() {
        return "StudentController [students=" + students + ", userView=" + userView + "]";
    }

}
