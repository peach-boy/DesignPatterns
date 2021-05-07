import model.ChannelEnum;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/7 17:58
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        PayStrategy payStrategy = Router.newInstance().getByChannelCode(ChannelEnum.ALIPAY.getChannelCode());
        payStrategy.pay();
    }
}
