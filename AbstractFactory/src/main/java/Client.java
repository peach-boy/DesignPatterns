import entity.Human;
import factory.FemaleHumanFactory;
import factory.HumanFactory;
import factory.MaleHumanFactory;

/**
 * @Description: main
 * @Auther: ThomasWu
 * @Date: 2018/11/2 23:05
 * @Email:1414924381@qq.com
 */
public class Client {

    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleHumanFactory();
        HumanFactory femaleFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();

        Human femaleYellowHuman=femaleFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
    }
}
