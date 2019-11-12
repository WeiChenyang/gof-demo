package singleton.hungryModel;

/**
 * @author Administrator
 * ����ģʽ  ����ʽ
 */
public class HungrySingleton {
	//˽�л�
	private HungrySingleton() {
	}
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	//�ṩ���ʽӿ�
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
	
	private int hsId;
	public int getHsId() {
		return hsId;
	}
	public void setHsId(int hsId) {
		this.hsId = hsId;
	}
}