package factory.abstractFactory.serviceImpl;

import factory.abstractFactory.iservice.ProductB;

/**
 * @author Administrator
 * ����Two������ƷB
 */
public class ConcreateProductTwoB implements ProductB{

	@Override
	public void method1() {
		System.out.println("Two�������Ĳ�ƷB method1()");
	}

	@Override
	public void method2() {
		System.out.println("Two�������Ĳ�ƷB method2()");
	}
}