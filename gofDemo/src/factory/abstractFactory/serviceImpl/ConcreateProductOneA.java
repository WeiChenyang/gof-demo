package factory.abstractFactory.serviceImpl;

import factory.abstractFactory.iservice.ProductA;

/**
 * @author Administrator
 * ����one������ƷA
 */
public class ConcreateProductOneA implements ProductA{

	@Override
	public void method1() {
		System.out.println("One�������Ĳ�ƷA method1()");
	}

	@Override
	public void method2() {
		System.out.println("One�������Ĳ�ƷA method2()");
	}
}
