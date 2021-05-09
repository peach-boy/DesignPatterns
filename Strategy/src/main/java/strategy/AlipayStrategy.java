package strategy;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/7 17:59
 * @Description: 支付宝支付
 */
public class AlipayStrategy implements PayStrategy {

    @Override
    public boolean pay() {
        System.out.println("支付宝支付--------------");
        return false;
    }
}
