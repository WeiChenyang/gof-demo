package bridge.impl;

import bridge.interfaces.Clothing;
import bridge.interfaces.Person;

/**
 * @author Administrator
 * ����
 */
public class Man extends Person{

	public Man() {
		setType("����");
	}

	//���·�
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCLoth(this);
	}

	
}