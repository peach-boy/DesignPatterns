import model.PayBO;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/7 17:59
 * @Description:余额支付
 */
public class BalancePayStrategy implements PayStrategy {

    public boolean pay() {
        System.out.println("余额支付--------------");
        return false;
    }
}
