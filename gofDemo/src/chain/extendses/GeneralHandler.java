package chain.extendses;

import chain.abstracts.ConsumeHandler;

/**
 * @author Administrator
 * �ܾ���
 */
public class GeneralHandler extends ConsumeHandler {
    
    @Override
    public void doHandler(String user, double free) {
        if (free >=1000) {
            
            if (user.equals("lwxzy")) {
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