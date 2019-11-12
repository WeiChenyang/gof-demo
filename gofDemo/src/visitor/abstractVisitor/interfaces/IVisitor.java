package visitor.abstractVisitor.interfaces;

import visitor.abstractVisitor.impl.ConcreteElement1;
import visitor.abstractVisitor.impl.ConcreteElement2;

/**
 * @author Administrator
 * ���������   �ӿ�
 */
public interface IVisitor {
	
	public void visit(ConcreteElement1 elements);
	public void visit(ConcreteElement2 elements);
}