package mediator.impl;

import mediator.interfaces.Department;
import mediator.interfaces.Mediator;

/**
 * @author Administrator
 * ����
 */
public class Finacial implements Department {

	//�����н��߶�������
	private Mediator mediator;
	public Finacial(Mediator mediator) {
		this.mediator = mediator;
		mediator.register("finacial", this);
	}
	@Override
	public void ownWork() {
		System.out.println("���񲿸������");
	}

	@Override
	public void outWork() {
		System.out.println("�����г������");
		mediator.command("Market");
	}

}
