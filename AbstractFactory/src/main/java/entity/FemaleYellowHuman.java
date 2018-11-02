package entity;

/**
 * @Description: 女性黄种人
 * @Auther: ThomasWu
 * @Date: 2018/11/2 22:22
 * @Email:1414924381@qq.com
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    static final String DESCRIPTION = "I am female  human";

    @Override
    public void getSex() {
        System.out.println(DESCRIPTION);
    }
}
