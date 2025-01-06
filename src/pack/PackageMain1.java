package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        // 같은 패키지에 소속되어있기에 패키지 경로 생략 가능
        Data data = new Data();
        // PackageMain1 과 User 는 서로 다른 패키지기에 전체 경로를 포함해서 적어주어야 한다.
        pack.a.User user = new pack.a.User();
    }
}
