package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 멤버 변수보다 매개변수가코드 블럭의 더 안쪽에 있다.
    // 따라서 매개변수가 우선순위를 가진다.
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
