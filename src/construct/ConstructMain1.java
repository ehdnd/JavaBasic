package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // cmd + P 파라미터 확인
        // 객체를 생성하면서 동시에 생성자를 호출한다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 60);
        // 직접 정의한 생성자를 반드시 호출해야한다. 컴파일 오류 발생으로 제약이 추가된다.
        MemberConstruct member2 = new MemberConstruct("user2", 16, 70);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("member.name = " + member.name);
        }

    }
}
