package flyWeightFactory.interfaces;

import flyWeightFactory.impl.Coordinate;

/**
 * @author Administrator
 * ������Ԫ��
 * ͨ����һ���ӿڻ�����࣬����������������Щ��������������ṩ������ڲ�״̬�������ⲿ״̬��
 */
public interface ChessFlyWeight {

	//��ȡ��ɫ���ڲ�״̬
	public String getColor();
	//չʾλ�ã��ⲿ״̬
	public void display(Coordinate c);
}
