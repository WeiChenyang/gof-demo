package visitor.abstractVisitor.impl;

import visitor.abstractVisitor.interfaces.Elements;
import visitor.abstractVisitor.interfaces.IVisitor;

/**
 * @author Administrator
 * Ԫ����2ʵ�廯
 */
public class ConcreteElement2 extends Elements{

	@Override
	public void doSomthing() {
		System.out.println("����Ԫ��2");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}