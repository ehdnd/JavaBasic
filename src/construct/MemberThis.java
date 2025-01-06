package construct;

public class MemberThis {
    String nameField;

    // this의 생략
    // 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다.
    // 이 경우 없으므로 멤버 변수에서찾는다.
    void initMember(String nameParameter) {
        nameField = nameParameter;

        // 무조건 this 적는 코딩스타일도 있다.
        // 근데 요즘 IDE 는 색상으로 구분해줘서 굳이..
        // this.nameField = nameParameter;

        // 관습.. 왜? 라는 본질적인 질문을 해보자.. 그랬더니 굳이 필요가 없네.
    }
}
