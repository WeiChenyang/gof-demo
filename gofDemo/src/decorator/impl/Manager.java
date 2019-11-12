package decorator.impl;

import decorator.interfaces.Project;

/**
 * @author Administrator
 * ��Ŀ����
 */
public class Manager implements Project{

	//������Ŀ�������ĳ���Ա
	private Project project;
	public Manager(Project project) {
		this.project = project;
	}

	//��Ŀ������
	@Override
	public void writeCodes() {
		startNewWork();
	}

	//��Ŀ����ʼ�Լ��µ���Ŀ
	public void startNewWork(){
		//��Ŀ�Ŀ�������
		doEarlyWork();
		project.writeCodes();
		doEndWork();
	}
	
	//��Ŀ�����Լ�����Ŀ��ʼ��������
	public void doEarlyWork(){
	}
	
	//��Ŀ��������β����
	public void doEndWork(){
	}
}
