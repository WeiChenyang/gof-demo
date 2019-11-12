package builder.serviceImpl;

import builder.iService.PersonBuilder;
import builder.vo.Person;

/**
 * @author Administrator
 * ������
 */
public class PersonDirector {
	
	public Person constructPerson(PersonBuilder personBuilder){
		personBuilder.buildHead();
		personBuilder.buildBody();
		personBuilder.buildFoot();
		return personBuilder.buildPerson();
	}
}
