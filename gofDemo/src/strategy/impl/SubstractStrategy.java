package strategy.impl;

import strategy.interfaces.Strategy;

/**
 * @author Administrator
 * ����
 */
public class SubstractStrategy implements Strategy{

	@Override
	public int calculate(int a, int b) {
		return a-b;
	}
}