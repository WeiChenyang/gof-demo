package strategy.impl;

import strategy.interfaces.Strategy;

/**
 * @author Administrator
 * ����
 */
public class DivisionStrategy implements Strategy{

	@Override
	public int calculate(int a, int b) {
		if (a!=0) {
			return a/b;
		} else {
			throw new RuntimeException("��������Ϊ�㣡");
		}
	}
}