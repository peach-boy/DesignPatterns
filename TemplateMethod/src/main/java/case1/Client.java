package case1;

/**
 * @Description: client
 * @Auther: ThomasWu
 * @Date: 2018/11/4 21:25
 * @Email:1414924381@qq.com
 */
public class Client {
    public static void main(String[] args) {
        AbstractGame abstractGame = new Game1();
        abstractGame.play();

        System.out.println();
        abstractGame = new Game2();
        abstractGame.play();
    }
}
