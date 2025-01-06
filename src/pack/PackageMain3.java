package pack;

import pack.a.User;

public class PackageMain3 {
    // 클래스 이름이 같아도 패키지 이름으로 대상을 구분할 수 있다.
    public static void main(String[] args) {
        User userA = new User(); // 자주사용하는걸 임포트
        pack.b.User userB = new pack.b.User(); // 자주 사용안하면 그냥 써야지
    }
}
