package proxy.staticProxy.impl;

import proxy.staticProxy.interfaces.IUserDao;

/**
 * 接口实现
 * 目标对象
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}