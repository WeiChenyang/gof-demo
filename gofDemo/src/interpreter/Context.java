package interpreter;
/** 
 *  �����������Ļ����ࡣ�����洢�������������Ļ�����������Ҫ���͵��ķ��� 
 * */  
public class Context {  
    private String in ;  
    private int out ;  
      
    public Context(String in) {  
        this.in = in ;   
    }  
  
    public int getOut() {  
        return out;  
    }  
  
    public void setOut(int out) {  
        this.in = String.valueOf( out ) ;    
        this.out = out;  
    }  
  
    public String getIn() {  
        return in;  
    }  
}