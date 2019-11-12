package proxy.proxy;

import proxy.staticProxy.impl.UserDao;
import proxy.staticProxy.interfaces.IUserDao;

public class Main {
	public static void main(String[] args) {
	        // Ŀ�����
	        IUserDao target = new UserDao();
	        System.out.println(target.getClass());
	
	        // ��Ŀ����󣬴����������
	        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
	        // class $Proxy0   �ڴ��ж�̬���ɵĴ������
	        System.out.println(proxy.getClass());
	
	        // ִ�з���   ���������
	        proxy.save();
	    }
}

