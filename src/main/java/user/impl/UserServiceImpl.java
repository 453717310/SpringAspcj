package user.impl;

import user.UserService;

/**
 * Created by dll on 2017/10/15.
 * @author dll
 */
public class UserServiceImpl implements UserService {
    /**
     *  主业务
     *  @return
     */
    @Override
    public String eat() {
      /* System.out.println("正在吃苹果......"+0/0);*/
        System.out.println("正在吃苹果......");
        return "apple";
    }

    /**
     * 主业务
     */
    @Override
    public void sleep() {
        System.out.println("正在休息......");
    }
}
