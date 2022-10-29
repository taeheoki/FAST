package Chapter3.ch13.web.userInfo;

import Chapter3.ch13.domain.userinfo.UserInfo;
import Chapter3.ch13.domain.userinfo.dao.UserInfoDao;
import Chapter3.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import Chapter3.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/taeheoki/Desktop/Git/FAST_JAVA/Java/src/main/java/Chapter3/ch13/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
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
