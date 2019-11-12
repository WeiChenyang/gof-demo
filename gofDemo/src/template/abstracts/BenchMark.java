package template.abstracts;

/**
 * @author Administrator
 *
 */
public abstract class BenchMark {

	//��������ʵ��   
	public abstract void benchMark();
	
	//�ظ��������benchMark()����
	public final long repeat(int count){
		if (count <= 0) {
			return 0;
		} else {
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < count; i++) {
				//benchMark()������ʵ���ӳٵ�������
				benchMark();
			}
			long stopTime = System.currentTimeMillis();
			System.out.println("startTime : " + startTime + ",stopTime : " + stopTime);
			return stopTime - startTime;
		}
	}
}