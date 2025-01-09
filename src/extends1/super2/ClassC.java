package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20);
        // super(); // 기본 생성자 불가능. ClassB의 생성자가 정의되어있다.
        System.out.println("ClassC 생성자");
    }
}
