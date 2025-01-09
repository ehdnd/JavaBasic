package final1;

public class FieldInit {

    // static final 붙으면 상수, 대문자로 - 바뀌지 않는 공용 변수 !
    static final int CONST_VALUE = 10;
    // 모든 인스턴스가 같은 값을 가진다 -> 이럴거면 static final
    final int value = 10;

    // 초깃값이 들어있으면 생성자로도 수정 불가
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
