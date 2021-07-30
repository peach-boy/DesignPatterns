package case1;

/**
 * @Description: 版本校验处理器
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 16:23
 * @Email:xiantao.wu@guanaitong.com
 */
public class VersionCheckHandler extends Handler {
    @Override
    public Boolean doHandle() {

        System.out.println("执行版本校验处理器");

        return Boolean.TRUE;
    }
}
