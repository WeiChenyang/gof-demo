package prototype.iservice;

/**
 * @author Administrator
 * ����ԭ�ͽ�ɫ�ӿ�
 */
public interface Prototype {
	
	public Prototype clone();
	public String getName();
	public void setName(String name);
}
