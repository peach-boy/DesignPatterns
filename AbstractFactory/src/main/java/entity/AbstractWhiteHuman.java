package entity;

/**
 * @Description: 白人抽象类
 * @Auther: ThomasWu
 * @Date: 2018/11/2 22:17
 * @Email:1414924381@qq.com
 */
public abstract class AbstractWhiteHuman implements Human {
    static final String DESCRIPTION = "I am white human";

    @Override
    public void getColor() {
        System.out.println(DESCRIPTION);
    }
}
