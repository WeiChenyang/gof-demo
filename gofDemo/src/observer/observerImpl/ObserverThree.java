package observer.observerImpl;

import observer.iObserver.Observer;
import observer.subject.Subject;

/**
 * @author Administrator
 * �۲���3
 */
public class ObserverThree extends Observer{

	public ObserverThree(Subject subject) {
		super(subject);
	}
	@Override
	public void update() {
		System.out.println("ObserverThree's state: " + subject.getState());
	}
}