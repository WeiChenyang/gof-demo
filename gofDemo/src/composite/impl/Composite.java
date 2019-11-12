package composite.impl;

import java.util.ArrayList;
import java.util.List;

import composite.abstracts.Component;

/**
 * @author Administrator
 * ����֦�ڵ���Ϊ�������洢�Ӳ�����
 * �� Component �ӿ���ʵ�����Ӳ�����صĲ��������� Add �� Remove��
 */
public class Composite extends Component {

	private List<Component> children = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++) {
			temp += '-';
		}
		System.out.println(temp + name);
		for (Component component : children) {
			component.display(depth+2);
		}
	}
}