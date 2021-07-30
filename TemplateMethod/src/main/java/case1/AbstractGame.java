package case1;

/**
 * @Description: 游戏基类
 * @Auther: ThomasWu
 * @Date: 2018/11/4 21:20
 * @Email:1414924381@qq.com
 */
public abstract class AbstractGame {
    abstract void initialize();

    abstract void startGame();

    abstract void endGame();

    public final void play() {
        initialize();
        startGame();
        endGame();
    }
}
