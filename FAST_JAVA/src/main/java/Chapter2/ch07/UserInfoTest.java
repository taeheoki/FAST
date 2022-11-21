package Chapter2.ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userKim = new UserInfo();
        userKim.userId = "a12345";
        userKim.userPassword = "zxcvbn12345";
        userKim.userName = "Kim";
        userKim.phoneNumber = "01034556699";
        userKim.userAddress = "Seoul, Korea";

        System.out.println(userKim.showUserInfo());

        UserInfo userLee = new UserInfo("b12345", "09876mnbvc", "Kim");
        System.out.println(userLee.showUserInfo());
    }
}
