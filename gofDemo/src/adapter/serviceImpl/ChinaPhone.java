package adapter.serviceImpl;

import adapter.iService.TwoPinSoket;

/**
 * @author Administrator
 * �й��ֻ�      ���ײ�ͷ   220V��ѹ
 */
public class ChinaPhone {
	private TwoPinSoket twoPinSoket;

	public ChinaPhone() { }
	
	//�ֻ�ͨ�����ײ�ͷ��ȡ���ĵ�ѹ
	public void setTwoPinSoket(TwoPinSoket twoPinSoket){
		this.twoPinSoket = twoPinSoket;
	}
	
	public void chargeRequest(){
		System.out.println("�й��ֻ� �����ײ�ͷ�ϻ�ȡ���ĵ�ѹΪ����" + twoPinSoket.voltage() + "V!");
	}
}