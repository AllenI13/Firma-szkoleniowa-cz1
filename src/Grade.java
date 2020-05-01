public class Grade {
    private Group group;
    private int grade;
    private Student student;

    public Grade(Group group, int grade, Student student) {
        this.group = group;
        this.grade = grade;
        this.student = student;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                '}';
    }
}
