package strategy.interfaces;

/**
 * @author Administrator
 * 定义一个接口( 抽象策略)，定义一个方法用于对两个整数进行运算
 */
public interface Strategy {

	public abstract int calculate(int a,int b);
}