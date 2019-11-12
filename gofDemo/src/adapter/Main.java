package adapter;

import adapter.serviceImpl.AmericaAdapter;
import adapter.serviceImpl.ChinaPhone;
import adapter.serviceImpl.ThreePinSoketAmerica;
import adapter.serviceImpl.TwoPinSoketChina;

public class Main {

	public static void main(String[] args) {
		// ���й��������ײ������
        TwoPinSoketChina twoPinSoketChina = new TwoPinSoketChina();
        ChinaPhone chinaPhone = new ChinaPhone();
        chinaPhone.setTwoPinSoket(twoPinSoketChina);
        chinaPhone.chargeRequest();

        // Ȼ�����ɻ�ȥ�������Σ�����ĳ�ùݵ�ǽ����ֻ��һ�����ײ���
        ThreePinSoketAmerica threePinSoketAmerica = new ThreePinSoketAmerica();
        threePinSoketAmerica.chargeWithThreePin();
        System.out.println("��ѹ��" + threePinSoketAmerica.voltage() + "����\n");

        // �Һ�����������������һͷ�嵽���ײ�������һͷת���ɶ��ײ������Ϳ��Ը��ҵ���ҫ�ֻ����
        AmericaAdapter americaAdapter = new AmericaAdapter(threePinSoketAmerica);
        americaAdapter.chargeWithTwoPin();
        System.out.println("��ѹ��" + americaAdapter.voltage() + "����\n");

        // ��������ͨ�������������������ղ������
        chinaPhone.setTwoPinSoket(americaAdapter);
        chinaPhone.chargeRequest();
	}
}
