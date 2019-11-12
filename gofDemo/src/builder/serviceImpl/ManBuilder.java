package builder.serviceImpl;

import builder.iService.PersonBuilder;
import builder.vo.Person;

/**
 * @author Administrator
 * person��������
 */
public class ManBuilder implements PersonBuilder {

	private Person person;
	
	public ManBuilder(Person person) {
		//������
		this.person = person;
	}

	@Override
	public void buildHead() {
		person.setHead("��ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("������");
	}

	@Override
	public void buildFoot() {
		person.setFoot("���");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
