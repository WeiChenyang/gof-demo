package builder;

import builder.serviceImpl.ManBuilder;
import builder.serviceImpl.PersonDirector;
import builder.vo.Man;
import builder.vo.Person;

public class Main {

	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();  
		//��������
        Person person = pd.constructPerson(new ManBuilder(new Man()));  
        System.out.println(person.getBody());  
        System.out.println(person.getFoot());  
        System.out.println(person.getHead()); 
	}
}
