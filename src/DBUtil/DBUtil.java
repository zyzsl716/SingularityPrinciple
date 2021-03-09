package DBUtil;

import java.sql.Connection;

public class DBUtil {

    public static String username = "zsl";
    public static String password = "wml";

    public static Connection getConnection() {
        Connection conn = null;
        if (username.equals("zsl") && password.equals("wml"))
        {
            System.out.println("连接数据库。。。");
            System.out.println("连接成功！");
        }
        else {
            System.out.println("连接失败！");
        }
        return conn;
    }
}
