import java.util.ArrayList;
import java.util.List;

public class Group {
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Group(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Group{" +
                "teacher=" + teacher.toString() +
                ", students=" + students.toString() +
                '}';
    }
}
