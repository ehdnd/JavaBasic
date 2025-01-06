package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        // `public` 클래스라 외부에서 접근 가능
        PublicClass publicClass = new PublicClass();

        // `default` 클래스 다른 패키지 접근 불가
        // DefaultClass1 class1 = new DefaultClass1;
    }
}
