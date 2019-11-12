package factory;

import factory.abstractFactory.iservice.AbstractFactory;
import factory.abstractFactory.serviceImpl.ConcreateFactoryOne;
import factory.abstractFactory.serviceImpl.ConcreateFactoryTwo;
import factory.simpleFactory.SimpleFactory;
import factory.simpleFactory.iservice.IFactory;

public class Main {

	public static void main(String[] args) {
		//�򵥹���ģʽ
		SimpleFactory simpleFactory = new SimpleFactory();
		IFactory product = (IFactory) simpleFactory.create("plane");
		product.create();
		
		//���󹤳�ģʽ
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>���󹤳�<<<<<<<<<<<<<<<<<<<<<<<<");
		AbstractFactory af1 = ConcreateFactoryOne.getInstance();
		af1.FactoryOne().method1();
		af1.FactoryOne().method2();
		af1.FactoryTwo().method1();
		af1.FactoryTwo().method2();
		AbstractFactory af2 = ConcreateFactoryTwo.getInstance();
		af2.FactoryOne().method1();
		af2.FactoryOne().method2();
		af2.FactoryTwo().method1();
		af2.FactoryTwo().method2();
	}
}
