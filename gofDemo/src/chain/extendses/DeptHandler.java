package chain.extendses;

import chain.abstracts.ConsumeHandler;

/**
 * @author Administrator
 * ���ž���
 */
public class DeptHandler extends ConsumeHandler {
    
    @Override
    public void doHandler(String user, double free) {
        if (free < 1000) {
            
            if (user.equals("zy")) {
                System.out.println("���豨��:" + free);
            } else {
                System.out.println("������ͨ��");
            }
            
        } else {
            if (getNextHandler() != null) {
                
                getNextHandler().doHandler(user, free);
            }
        }
        
    }
}