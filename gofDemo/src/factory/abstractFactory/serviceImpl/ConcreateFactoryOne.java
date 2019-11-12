package factory.abstractFactory.serviceImpl;

import factory.abstractFactory.iservice.AbstractFactory;
import factory.abstractFactory.iservice.ProductA;
import factory.abstractFactory.iservice.ProductB;

/**
 * @author Administrator
 * ����Oneʵ��������������ƷA�Ͳ�ƷB
 */
public class ConcreateFactoryOne extends AbstractFactory{
	
	private ConcreateFactoryOne(){}
	private static final ConcreateFactoryOne concreateFactoryOne = new ConcreateFactoryOne();
	public static ConcreateFactoryOne getInstance(){
		return concreateFactoryOne;
	}
	
	@Override
	public ProductA FactoryOne() {
		return new ConcreateProductOneA();
	}

	@Override
	public ProductB FactoryTwo() {
		return new ConcreateProductOneB();
	}
}