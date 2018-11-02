package factory;

import entity.Human;

/**
 * @Description: 人类工厂类
 * @Auther: ThomasWu
 * @Date: 2018/11/2 22:12
 * @Email:1414924381@qq.com
 */
public interface HumanFactory {
    public Human createYellowHuman();

    public Human createWhiteHuman();

    public Human createBlackHuman();

}
