import case1.HandlerChain;
import case1.SignCheckHandler;
import case1.TimestampCheckHandler;
import case1.VersionCheckHandler;
import case2.CashProcesser;
import case2.CouponProcesser;
import case2.ProcesserChain;
import case2.RedPackerProcesser;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/7 18:50
 * @Description:责任链模式
 */
public class Client {

    public static void main(String[] args) {

        //case1 链表实现

        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new TimestampCheckHandler());
        handlerChain.addHandler(new VersionCheckHandler());
        handlerChain.addHandler(new SignCheckHandler());
        Boolean result = handlerChain.handle();
        System.out.println(result);


        //case2 数组实现
        ProcesserChain processerChain = new ProcesserChain();
        processerChain.addProcesser(new RedPackerProcesser());
        processerChain.addProcesser(new CashProcesser());
        processerChain.addProcesser(new CouponProcesser());
        processerChain.excute();


    }
}
