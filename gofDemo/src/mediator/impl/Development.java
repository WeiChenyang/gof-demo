package mediator.impl;

import mediator.interfaces.Department;
import mediator.interfaces.Mediator;

/**
 * @author Administrator
 * �з���
 */
public class Development implements Department {

	//�����н��߶�������
	private Mediator mediator;
	
	public Development(Mediator mediator) {
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void ownWork() {
		System.out.println("�з��������з�����");
	}

	@Override
	public void outWork() {
		System.out.println("�з�������������");
		mediator.command("finacial");
	}
}