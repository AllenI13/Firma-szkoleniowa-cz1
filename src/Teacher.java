public class Teacher extends Person {
    public Teacher(String name, String surname, int id) {
        super(name, surname, id);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
