package mediator.impl;

import mediator.interfaces.Department;
import mediator.interfaces.Mediator;

/**
 * @author Administrator
 * �г���
 */
public class Market implements Department {

	//�����н��߶�������
	private Mediator mediator;
	public Market(Mediator mediator) {
		this.mediator = mediator;
		mediator.register("Market", this);
	}
	@Override
	public void ownWork() {
		System.out.println("�г���������Ŀ�нӹ���");
	}

	@Override
	public void outWork() {
		System.out.println("�����з������");
		mediator.command("development");
	}
}