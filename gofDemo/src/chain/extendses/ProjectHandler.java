package chain.extendses;

import chain.abstracts.ConsumeHandler;

/**
 * @author Administrator
 * ��Ŀ����
 */
public class ProjectHandler extends ConsumeHandler {

    @Override
    public void doHandler(String user, double free) {
        if (free < 500) {

            if (user.equals("lwx")) {
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