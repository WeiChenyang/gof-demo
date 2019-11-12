package builder.iService;

import builder.vo.Person;

/**
 * @author Administrator
 * Person����Ĺ���ӿ�
 */
public interface PersonBuilder {
	public void buildHead();
	public void buildBody();
	public void buildFoot();
	public Person buildPerson();
}
