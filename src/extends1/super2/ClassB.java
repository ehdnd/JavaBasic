package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 0); // 다른 생성자 호출
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자. 생략 가능 - 반드시 한번은 super 호출이 필요
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
