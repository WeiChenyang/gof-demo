package singleton.lazyModel;

/**
 * @author Administrator
 * ����ģʽ  ����ʽ
 * ֻ�ǵ�һ��ʵ����
 */
public class LazySingleton {
	
	private LazySingleton(){}
	private static LazySingleton lazySingleton = null;
	public static synchronized LazySingleton getInstance(){
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
	
	private int lsId;
	public int getLsId() {
		return lsId;
	}

	public void setLsId(int lsId) {
		this.lsId = lsId;
	}
}
