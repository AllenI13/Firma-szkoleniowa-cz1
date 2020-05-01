public class Test {
    public static void main(String[] args) {
        Student student = new Student("Kacper", "Pieczonka", 997);
        Student student1 = new Student("Kacper", "Pieczonka", 997);
        Teacher teacher = new Teacher("Mariusz", "Nowak", 555);
        Group group = new Group(teacher);
        group.addStudent(student);
        group.addStudent(student1);
        System.out.println(group.toString());
    }
}
