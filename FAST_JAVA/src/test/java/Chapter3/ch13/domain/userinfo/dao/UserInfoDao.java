package Chapter3.ch13.domain.userinfo.dao;

import Chapter3.ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
    public void insertUserInfo(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);
    public void deleteUserInfo(UserInfo userInfo);
}
