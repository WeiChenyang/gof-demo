package visitor.abstractVisitor.interfaces;

/**
 * @author Administrator
 * ����Ԫ����  �ӿ�
 */
public abstract class Elements {

	public abstract void accept(IVisitor visitor);
	public abstract void doSomthing();
}