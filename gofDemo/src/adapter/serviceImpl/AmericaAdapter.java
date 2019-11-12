package adapter.serviceImpl;

import adapter.iService.ThreePinSoket;
import adapter.iService.TwoPinSoket;

/**
 * @author Administrator
 *��������   ȥ�������������ײ���
 *
 *  ʵ�����ײ�����׼
 *  ������������ײ���
 *  ������  ת�� 
 *  �����ײ�ͷͨ����������ʹ�����ײ���
 */
public class AmericaAdapter implements TwoPinSoket {

	private ThreePinSoket threePinSoket;
	
	public AmericaAdapter(ThreePinSoket threePinSoket){
		this.threePinSoket = threePinSoket;
	}
	
	//���ײ�ͷ��������������ȡ���ײ���
	@Override
	public void chargeWithTwoPin() {
		threePinSoket.chargeWithThreePin();
	}

	//���ײ�ͷ��������������ȡ���ײ�����ѹ
	//������110V��ѹת��Ϊ�й�����220V��׼��ѹ����
	@Override
	public int voltage() {
		return threePinSoket.voltage()*2;
	}
}