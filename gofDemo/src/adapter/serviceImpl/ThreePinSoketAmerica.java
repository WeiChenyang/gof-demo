package adapter.serviceImpl;

import adapter.iService.ThreePinSoket;

/**
 * @author Administrator
 * �������ߣ� ���ײ���ʵ����
 */
public class ThreePinSoketAmerica implements ThreePinSoket {

	@Override
	public void chargeWithThreePin() {
		System.out.println("������   �����������ײ���");
	}

	@Override
	public int voltage() {
		return 110;
	}

}
