package Chpater2.ch07;

public class UserInfo {
    public String userId;
    public String userPassword;
    public String userName;
    public String phoneNumber;
    public String userAddress;

    public UserInfo() {}

    public UserInfo(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
    }
}
