package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        System.out.println();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); // 부모 기능 시용 가능
        child.childMethod(); // 자신 기능 사용 가능
        System.out.println();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모 타입은 자식을 참조 가능
        poly.parentMethod();
        System.out.println();

        // Child child1 = new Parent(); // 자식은 부모를 담을 수 없다. (컴파일 오류)

        // 자식의 기능은 호출할 수 없다. (컴파일 오류) .. 자식에 대한 정보가 없으니까?
        // poly.childMethod(); // poly 는
    }
}
