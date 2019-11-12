package memento;

/**
 * @author Administrator
 * ������
 */
public class Originator {

	//��Ҫ���������
	private String state;
	
	//��������¼������Ҫ�������Ϣ���벢ʵ������memento����
	public Memento createMemento(){
		return new Memento(state);
	}
	//�ָ�����¼����memento���벢�ָ��������
	public void setMemento(Memento memento){
		state = memento.getState();
	}
	//��ʾ����
	public void show(){
		System.out.println("state = " + state);
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}