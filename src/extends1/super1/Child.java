package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this 생략 가능. 생략시 내꺼 먼저 찾고 없으면 부모꺼 찾는다
        System.out.println("super.value = " + super.value);

        this.hello();
        super.hello();
    }
}
