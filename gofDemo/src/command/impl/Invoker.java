package command.impl;

import command.interfaces.Command;

public class Invoker {

	//�����߳����������
	private Command command;

	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	//ִ������
	public void runCommand(){
		command.execute();
	}
	//��������
	public void unDoCommand(){
		command.undo();
	}
}