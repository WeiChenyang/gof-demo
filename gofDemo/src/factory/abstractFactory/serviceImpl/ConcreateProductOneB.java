package factory.abstractFactory.serviceImpl;

import factory.abstractFactory.iservice.ProductB;

/**
 * @author Administrator
 * ����One������ƷB
 */
public class ConcreateProductOneB implements ProductB{

	@Override
	public void method1() {
		System.out.println("One�������Ĳ�ƷB method1()");
	}

	@Override
	public void method2() {
		System.out.println("One�������Ĳ�ƷB method2()");
	}
}