package memento;

public class Main {
	
    public static void main(String[] args) {  
        //��ʼ״̬Ϊon  
        Originator o = new Originator();  
        o.setState("on");  
        o.show();  
          
        //����״̬��������Originator��ʵ��ϸ��  
        Caretaker c = new Caretaker();  
        c.setMemento(o.createMemento());  
          
        o.setState("off");  
        o.show();  
          
        //�ָ�״̬  
        o.setMemento(c.getMemento());  
        o.show();  
    } 
}