package access.a;

// public 클래스는 반드시 파일명과 같아야
// 하나의 자바 파일에 `public` 클래스는 하나만 등장 가능
// `default` 접근 제어자를 사용하는 클래스는 무한정 가능

public class PublicClass {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {
    // `default` 접근 제어자
}

class DefaultClass2 {
    // `default` 접근 제어자
}

