package proxy.cglibProxy;
public class Main {

	public static void main(String[] args) {
		//Ŀ�����
        UserDao target = new UserDao();

        //�������
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //ִ�д������ķ���
        proxy.save();
	}
}