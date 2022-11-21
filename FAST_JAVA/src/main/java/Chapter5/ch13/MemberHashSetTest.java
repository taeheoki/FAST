package Chapter5.ch13;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberKim = new Member(1001, "김유신");
        Member memberLee = new Member(1002, "이순신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKang);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
