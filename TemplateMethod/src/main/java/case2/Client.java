package case2;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 13:36
 * @Email:xiantao.wu@guanaitong.com
 */
public class Client {

    public static void main(String[] args) {
        BankPayNotify bankPayNotify = new BankPayNotify();
        bankPayNotify.payNotify("request");

    }
}
