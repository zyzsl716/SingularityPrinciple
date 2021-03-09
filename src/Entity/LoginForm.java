package Entity;

import Dao.UserDao;
public class LoginForm {

    private final UserDao dao = new UserDao();

    public LoginForm(String userName,String passWord) {
        init();
        display();
        validate(userName,passWord);
    }

    public void init() {
        System.out.println("初始化页面。。。");
    }

    public void display() {
        System.out.println("显示成功！");
    }

    public void validate(String userName,String passWord) {
        if(dao.findUser(userName, passWord))
        {
            System.out.println("验证成功！");
        }else {
            System.out.println("验证失败！");
        }
    }

}
