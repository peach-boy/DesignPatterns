package case1;

/**
 * @Description: 签名校验处理器
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 16:18
 * @Email:xiantao.wu@guanaitong.com
 */
public class SignCheckHandler extends Handler {

    @Override
    public Boolean doHandle() {

        System.out.println("执行签名校验处理器");

        return Boolean.FALSE;
    }
}
