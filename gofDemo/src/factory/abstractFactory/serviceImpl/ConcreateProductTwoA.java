package factory.abstractFactory.serviceImpl;

import factory.abstractFactory.iservice.ProductA;

/**
 * @author Administrator
 * ����Two������ƷA
 */
public class ConcreateProductTwoA implements ProductA{

	@Override
	public void method1() {
		System.out.println("Two�������Ĳ�ƷA method1()");
	}

	@Override
	public void method2() {
		System.out.println("Two�������Ĳ�ƷA method2()");
	}
}
