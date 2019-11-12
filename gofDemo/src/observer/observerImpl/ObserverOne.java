package observer.observerImpl;

import observer.iObserver.Observer;
import observer.subject.Subject;

/**
 * @author Administrator
 * �۲���1   �̳й۲��߸���
 */
public class ObserverOne extends Observer{

	public ObserverOne(Subject subject) {
		//���ø����й��캯�������¼ӹ۲�����ӵ�Ŀ�����ܵĹ۲��߼�����
		super(subject);
	}

	@Override
	public void update() {
		//���¸��࣬Ӧ�ø����еĳ�Ա����
		System.out.println("ObserverOne's state: " + subject.getState());
	}
}