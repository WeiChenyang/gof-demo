package proxy.staticProxy.impl;

import proxy.staticProxy.interfaces.IUserDao;

/**
 * �ӿ�ʵ��
 * Ŀ�����
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----�Ѿ���������!----");
    }
}