package visitor.abstractVisitor.impl;

import visitor.abstractVisitor.interfaces.Elements;
import visitor.abstractVisitor.interfaces.IVisitor;

/**
 * @author Administrator
 * Ԫ����1ʵ�廯
 */
public class ConcreteElement1 extends Elements{

	@Override
	public void doSomthing() {
		System.out.println("����Ԫ��1");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}