package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        // public 클래스라 외부에서 접근 가능
        PublicClass publicClass = new PublicClass();

        // 같은 패키지라 접근 가능
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
