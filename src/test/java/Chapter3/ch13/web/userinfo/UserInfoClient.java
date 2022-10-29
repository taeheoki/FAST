package Chapter3.ch13.web.userinfo;

import Chapter3.ch13.domain.userinfo.UserInfo;
import Chapter3.ch13.domain.userinfo.dao.UserInfoDao;
import Chapter3.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import Chapter3.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/taeheoki/Desktop/Git/FAST_JAVA/Java/src/test/java/Chapter3/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");;

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("taeheoki");
        UserInfoDao userInfoDao = null;

        if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else {
            System.out.println("db error");
            return ;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
