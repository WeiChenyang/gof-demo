package mediator.interfaces;

/**
 * @author Administrator
 * �����н���
 */
public interface Mediator {

	//��¼����ͬ����
	public void register(String name,Department obj);
	//��������
	public void command(String name);
}