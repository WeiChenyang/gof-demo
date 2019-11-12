package observer.subject;

import java.util.ArrayList;
import java.util.List;

import observer.iObserver.Observer;

/**
 * @author Administrator
 * Ŀ����
 */
public class Subject {
	//�����۲���set����
	//private final Set<Observer> observers = new HashSet<Observer>();
	private final List<Observer> observers = new ArrayList<Observer>();
	//Ŀ��״̬
	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	//���ӣ���ӹ۲���
	public void attach(Observer observer){
		observers.add(observer);
	}
	//ͨ�����й۲���
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
}