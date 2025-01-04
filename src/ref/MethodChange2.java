package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("dataA.value = " + dataA.value);
    }

    // 자바에서는 항상 값을 복사해서 전달한다.
    // 그러나 이 값이 실제 값이냐, 참조(메모리 주소) 값이냐에 따라 동작이 달라진다.
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
