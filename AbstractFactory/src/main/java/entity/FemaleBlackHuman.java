package entity;

/**
 * @Description: 女性黑人
 * @Auther: ThomasWu
 * @Date: 2018/11/2 22:22
 * @Email:1414924381@qq.com
 */
public class FemaleBlackHuman extends AbstractWhiteHuman {
    static final String DESCRIPTION = "I am female  human";

    @Override
    public void getSex() {
        System.out.println(DESCRIPTION);
    }
}
