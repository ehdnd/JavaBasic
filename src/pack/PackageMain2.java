package pack;

// import 덕분에 패키지 명을 생략하고 클래스 이름만 적을 수 있다.

import pack.a.*; // pack.a의 모든 클래스 사용

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }
}
