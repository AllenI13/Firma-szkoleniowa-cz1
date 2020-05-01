public class Student extends Person {
    public Student(String name, String surname, int id) {
        super(name, surname, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
