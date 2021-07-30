package entity;

/**
 * @Description: 男性白人
 * @Auther: ThomasWu
 * @Date: 2018/11/2 22:22
 * @Email:1414924381@qq.com
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
    static final String DESCRIPTION = "I am male  human";

    @Override
    public void getSex() {
        System.out.println(DESCRIPTION);
    }
}
