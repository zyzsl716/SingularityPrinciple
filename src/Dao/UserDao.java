package Dao;

import DBUtil.DBUtil;
import java.sql.Connection;

public class UserDao {
    private DBUtil db;

    public boolean findUser(String userName, String passWord) {
        Connection conn = DBUtil.getConnection();
        if (userName.equals("zsl") && passWord.equals("wml"))
        {
            System.out.println("登录成功！");
            return true;
        } else {
            System.out.println("用户名或密码错误！");
            return false;
        }
    }
}
