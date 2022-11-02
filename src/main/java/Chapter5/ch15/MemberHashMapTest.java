package Chapter5.ch15;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1);
    }
}

public class MemberHashMapTest {
    public static void main(String[] args) {
//        HashMap<String> set = new HashMap<String>();
//
//        set.add("홍길동");
//        set.add("강감찬");
//        set.add("이순신");
//
//        for (String str : set)
//            System.out.println(str);
/*
        MemberHashMap memberHashMap = new MemberHashMap();
        Member memberHong = new Member(1004, "홍길동");
        Member memberKim = new Member(1001, "김유신");
        Member memberLee = new Member(1002, "이순신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKang);
        memberHashMap.showAllMember();

        memberHashMap.addMember(memberHong);
        memberHashMap.showAllMember();
 */
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "Park");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Kim");
        hashMap.put(1004, "Hong");

        System.out.println(hashMap);
    }
}
