package case1;

/**
 * @Description: 时间戳校验处理器
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 16:18
 * @Email:xiantao.wu@guanaitong.com
 */
public class TimestampCheckHandler extends Handler {

    @Override
    public Boolean doHandle() {

        System.out.println("执行时间戳校验处理器");

        return Boolean.TRUE;
    }
}
