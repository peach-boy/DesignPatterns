package factory;

import entity.FemaleBlackHuman;
import entity.FemaleWhiteHuman;
import entity.FemaleYellowHuman;
import entity.Human;

/**
 * @Description: 女性工厂类
 * @Auther: ThomasWu
 * @Date: 2018/11/2 23:04
 * @Email:1414924381@qq.com
 */
public class FemaleHumanFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
