package imp1;

/**
 * @Description: 单例模式
 * @Auther: ThomasWu
 * @Date: 2018/10/31 21:56
 * @Email:1414924381@qq.com
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
