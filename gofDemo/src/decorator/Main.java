package decorator;

import decorator.impl.Employe;
import decorator.impl.ManagerA;
import decorator.impl.ManagerB;
import decorator.interfaces.Project;

/**
 * @author Administrator
 * ���ӣ���Ŀ����ӵ�һ����Ŀ����Ŀ����Ҫ��ɱ��롣
 *	��Ŀ����ӵ���Ŀ������Щǰ�ڵĹ��������������������ƣ���
 *	Ȼ�󽫱��빤��ί�ɸ����빤�ˣ����빤�˸������Ŀ��������Ŀ����β������
 */
public class Main {

	public static void main(String[] args) {
		Project employe = new Employe();
		Project managerA = new ManagerA(employe);
		Project managerB = new ManagerB(employe);
		
		//��Ŀ����������
		managerA.writeCodes();
		managerB.writeCodes();
	}
}