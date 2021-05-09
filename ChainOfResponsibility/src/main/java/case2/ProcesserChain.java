package case2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Auther: xiantao.wu
 * @Date: 2021/5/9 16:43
 * @Email:xiantao.wu@guanaitong.com
 */
public class ProcesserChain {

    private List<Processer> processerList = new ArrayList<>();


    public void addProcesser(Processer processer) {
        this.processerList.add(processer);
    }

    public void excute() {
        for (Processer processer : processerList) {
            try {
                processer.pay();
            }catch(Exception e){
                System.out.println("发生异常");
                break;
            }
        }
    }


}
