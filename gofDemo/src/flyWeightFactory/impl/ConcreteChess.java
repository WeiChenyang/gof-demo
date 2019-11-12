package flyWeightFactory.impl;

import flyWeightFactory.interfaces.ChessFlyWeight;

/**
 * @author Administrator
 * ������Ԫ��
 * Ϊ�ڲ�״̬�ṩ��Ա�������д洢
 */
public class ConcreteChess implements ChessFlyWeight{

	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("������ɫ��" + color);
		System.out.println("�������꣺" + c.getX() + "," + c.getY());
	}
}