package factory;

import entity.Human;
import entity.MaleBlackHuman;
import entity.MaleWhiteHuman;
import entity.MaleYellowHuman;

/**
 * @Description: 男性工厂类
 * @Auther: ThomasWu
 * @Date: 2018/11/2 23:01
 * @Email:1414924381@qq.com
 */
public class MaleHumanFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
