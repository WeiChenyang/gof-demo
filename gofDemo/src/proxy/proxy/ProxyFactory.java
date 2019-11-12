package proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 * ��̬����
 * ��̬������Ҫʵ�ֽӿڣ�������Ҫ�ƶ��ӿ�����
 */
public class ProxyFactory {

	//ά��һ��Ŀ�����
	private Object target;
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//��Ŀ��������ɴ������
	public Object getProxyInstance(){
		ClassLoader loader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		InvocationHandler h = new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				System.out.println("��ʼ����2");
				//ִ��Ŀ����󷽷�
				Object returnValue = method.invoke(target, args);
				System.out.println("�ύ����2");
				return returnValue;
			}
		};
		return Proxy.newProxyInstance(loader, interfaces, h);
	}
}
