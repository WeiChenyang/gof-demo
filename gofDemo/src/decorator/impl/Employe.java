package decorator.impl;

import decorator.interfaces.Project;

/**
 * @author Administrator
 * ��ũ
 */
public class Employe implements Project {

	//д����
	@Override
	public void writeCodes() {
		System.out.println("��ũ������룬д��д���Ӱ��д������д����");
	}
}