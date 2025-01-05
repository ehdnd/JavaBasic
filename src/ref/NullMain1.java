package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // 참조형 변수에서 아직 가리키는 대상이 없다는 뜻으로 사용
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);

        // 앞서 생성한 `x001` 인스턴스를 아무도 사용하지 않는다.
        // 다시 `x001`의 주소값을 다시 찾을 수 없다. 즉, 다시 접근할 방법이 없다
        // 아무도 사용하지 않는 인스턴스는 GC(가비지 컬렉션)이 자동으로 메모리를 제거해준다.
        data = null;
        System.out.println("3 .data = " + data);
    }
}
