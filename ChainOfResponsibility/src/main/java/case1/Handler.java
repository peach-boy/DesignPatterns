package case1;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 13:48
 */
public abstract class Handler {

    protected Handler nextHandler;


    public final boolean handle() {
        boolean result = doHandle();

        //不满足条件返回false
        if (!result) {
            return result;
        }

        if (nextHandler != null) {
            return nextHandler.handle();
        } else {
            return true;
        }

    }

    public abstract Boolean doHandle();

}
