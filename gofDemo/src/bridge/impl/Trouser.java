package bridge.impl;

import bridge.interfaces.Clothing;
import bridge.interfaces.Person;

/**
 * @author Administrator
 * ���崩������
 */
public class Trouser extends Clothing {  

	@Override
	public void personDressCLoth(Person person) {
		System.out.println(person.getType() + "������");  
	}  
}  