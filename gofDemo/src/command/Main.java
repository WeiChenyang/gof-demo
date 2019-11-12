package command;

import command.impl.CreateCommand;
import command.impl.Invoker;
import command.impl.Receiver;
import command.interfaces.Command;

public class Main {

	public static void main(String[] args) {
		//����������
		Receiver receiver = new Receiver();
		//����������󣬲��������Ľ�����
		Command command = new CreateCommand(receiver);
		
		//���������ߣ�������������ý�ȥ
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		invoker.runCommand();
		invoker.unDoCommand();
	}
}