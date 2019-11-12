package visitor.abstractVisitor.impl;

import visitor.abstractVisitor.interfaces.IVisitor;

/**
 * @author Administrator
 * ������ʵ�廯
 */
public class Visitor implements IVisitor {

	@Override
	public void visit(ConcreteElement1 elements1) {
		elements1.doSomthing();
	}
	@Override
	public void visit(ConcreteElement2 elements2) {
		elements2.doSomthing();
	}
}