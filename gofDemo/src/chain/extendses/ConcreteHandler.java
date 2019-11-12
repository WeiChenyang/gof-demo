package chain.extendses;

import chain.abstracts.Handler;

public class ConcreteHandler extends Handler {

	@Override
	public void doHandler() {
		if (getNextHandler() != null) {
			System.out.println("����������");
			getNextHandler().doHandler();
		} else {
			System.out.println("�Լ�����");
		}
	}

}
