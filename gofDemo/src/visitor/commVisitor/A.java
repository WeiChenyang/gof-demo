package visitor.commVisitor;

/**
 * @author Administrator
 * B�������A����˵��A���ڱ�������
 */
public class A {

	public void method1(){
		System.out.println("����A��");
	}
	public void method2(B b){
		b.method(this);
	}
}
