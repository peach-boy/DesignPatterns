package case1;


/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 13:59
 * @Email:xiantao.wu@guanaitong.com
 */
public class HandlerChain {

    private Handler head;

    private Handler tail;

    public void addHandler(Handler handler) {
        handler.nextHandler = null;

        if (head == null) {
            head = handler;
            tail = handler;
        } else {
            tail.nextHandler = handler;
            tail = handler;
        }
    }


    public boolean handle() {
        if (head != null) {
            return head.handle();
        } else {
            return true;
        }
    }


}
