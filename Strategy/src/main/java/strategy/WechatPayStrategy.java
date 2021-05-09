package strategy;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/7 17:59
 * @Description:微信支付
 */
public class WechatPayStrategy implements PayStrategy {

    @Override
    public boolean pay() {
        System.out.println("微信支付--------------");
        return false;
    }
}
