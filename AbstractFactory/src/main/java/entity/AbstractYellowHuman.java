package entity;

/**
 * @Description: 黄种人抽象类
 * @Auther: ThomasWu
 * @Date: 2018/11/2 22:20
 * @Email:1414924381@qq.com
 */
public abstract class AbstractYellowHuman implements Human {
    static final String DESCRIPTION = "I am yellow human";

    @Override
    public void getColor() {
        System.out.println(DESCRIPTION);
    }
}
