package case2;

/**
 * @Description: 现金处理器
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 16:41
 * @Email:xiantao.wu@guanaitong.com
 */
public class CashProcesser implements Processer {

    @Override
    public void pay() throws Exception {

        System.out.println("执行现金处理器");

        throw new Exception();
    }
}
