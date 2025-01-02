package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        // student 변수 2개 보관할수 있는 사이즈 2 의 배열을 제작
        // `Student` 타입의 참조값을 보관
        // 배열은 `null` 값으로 초기화
        Student[] students = new Student[2];
        // 자바에서 대입은 항상 변수에 들어있는 값을 복사한다.
        // 변수에는 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이기에 참조값만 복사된다.
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
    }
}
