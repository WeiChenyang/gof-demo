package proxy.staticProxy;

import proxy.staticProxy.impl.UserDao;
import proxy.staticProxy.impl.UserDaoProxy;

public class Main {

	public static void main(String[] args) {
		//Ŀ�����
        UserDao target = new UserDao();

        //�������,��Ŀ����󴫸��������,���������ϵ
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//ִ�е��Ǵ���ķ���
	}
}
