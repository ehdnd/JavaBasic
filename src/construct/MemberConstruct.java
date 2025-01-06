package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
        // 변경. 생성자 안에서만 사용가능
        // 생성자 내부에서 다른 생성자를 호출가능. 생성자 중복 제거 가능
        // 생성자 코드의 '첫 줄'에만 작성 가능
        this(name, age, 50);

        // this.name = name;
        // this.age = age;
        // this.grade = 50;
    }

    // 생성자를 사용하면 객체를 생성ㅇ하는 시점에 즉시 필요한 기능을 수행할 수 있다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
