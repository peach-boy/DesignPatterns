import model.ChannelCodeEnum;
import strategy.PayStrategy;
import strategy.Router;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/7 17:58
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        PayStrategy payStrategy = Router.newInstance().getByChannelCode(ChannelCodeEnum.ALIPAY.getChannelCode());
        payStrategy.pay();
    }
}
