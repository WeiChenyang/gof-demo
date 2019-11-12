package state.impl;

import state.interfaces.IState;

public class Context {  
  
    /** 
     * ����һ��State���͵Ķ���ʵ�� 
     */  
    private IState state;  
  
    public void setState(final IState state) {  
        this.state = state;  
    }  
  
    /** 
     * �û�����Ȥ�Ľӿڷ��� 
     */  
    public void request(final String sampleParameter) {  
        // ת��state������  
        state.handle(sampleParameter);  
    }  
}