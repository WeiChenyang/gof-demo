package adapter.serviceImpl;

import adapter.iService.TwoPinSoket;

/**
 * @author Administrator
 * �й����ײ���      �����ֻ���׼
 */
public class TwoPinSoketChina implements TwoPinSoket {

	@Override
	public void chargeWithTwoPin() {
		System.out.println("�й���׼�����ײ���");
	}

	@Override
	public int voltage() {
		return 220;
	}
}