package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 17, 80);
        Student student2 = createStudent("학생2", 16, 90);

        printStudent(student1);
        printStudent(student2);

    }

    // 자바에서는 객체가 참조되는 한 메모리가 유지된다... 굳이 고민하지 말자
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
