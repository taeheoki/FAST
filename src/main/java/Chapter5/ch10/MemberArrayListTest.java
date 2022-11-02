package Chapter5.ch10;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberKim = new Member(1001, " 김유신");
        Member memberLee = new Member(1002, " 이순신");
        Member memberKang = new Member(1003, " 강감찬");
        Member memberHong = new Member(1004, " 홍길동");

        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);
        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberLee.getMemberId());
        memberArrayList.showAllMember();

    }
}
