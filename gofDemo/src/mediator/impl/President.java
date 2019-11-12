package mediator.impl;

import java.util.HashMap;
import java.util.Map;

import mediator.interfaces.Department;
import mediator.interfaces.Mediator;

/**
 * @author Administrator
 * �ܾ���      ����Э�������Ź�����ϵ
 */
public class President implements Mediator {

	private Map<String,Department> map = new HashMap<String,Department>();
	@Override
	public void register(String name, Department obj) {
		map.put(name, obj);
	}

	@Override
	public void command(String name) {
		map.get(name).ownWork();
	}

}
