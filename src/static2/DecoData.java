package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 정적 변수에 접근
        staticValue++;
        // 정적 메서드에 접근
        staticMethod();

        // 인스턴스 변수, 메서드 접근 불가
        // 당연히 클래스 붕어빵 틀에서는 붕어빵을 참조할 수 없겠지..
        // instanceValue++;
        // instanceMethod();
    }

    public void instanceCall() {
        // 정적 변수에 접근
        staticValue++;
        // 정적 메서드에 접근
        staticMethod();

        // 인스턴스 변수, 메서드 접근
        instanceValue++;
        instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
