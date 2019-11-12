package composite.impl;

import composite.abstracts.Component;

/**
 * @author Administrator
 * ��ʾҶ�ڵ����Ҷ�ӽڵ�û���ӽڵ㡣
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("�������һ��Ҷ�ڵ�");
	}

	@Override
	public void remove(Component component) {
		System.out.println("�����Ƴ�һ��Ҷ�ڵ�");
	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++) {
			temp += '-';
		}
		System.out.println(temp + name);
	}
}