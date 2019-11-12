package observer.iObserver;

import observer.subject.Subject;

/**
 * @author Administrator
 * �۲��߸���
 */
public abstract class Observer {

	//����Ŀ����
	protected Subject subject;
	//�۲��߳�ʼ�������¼ӹ۲�����ӵ�Ŀ�����й۲��߼�����
	protected Observer(Subject subject){
		this.subject = subject;
		subject.attach(this);
	}
	//�������������۲��������б�����update����
	public abstract void update();
}