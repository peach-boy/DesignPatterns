import model.ChannelEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/7 18:07
 * @Description:
 */
public class Router {

    private Map<Integer, PayStrategy> payStrategyMap;

    private Router() {
    }


    public static Router newInstance() {
        Router router = new Router();
        router.payStrategyMap = new HashMap<Integer, PayStrategy>(3);
        router.payStrategyMap.put(ChannelEnum.ALIPAY.getChannelCode(), new AlipayStrategy());
        router.payStrategyMap.put(ChannelEnum.WECHAT.getChannelCode(), new WechatPayStrategy());
        router.payStrategyMap.put(ChannelEnum.BALANCE.getChannelCode(), new BalancePayStrategy());
        return router;
    }


    public PayStrategy getByChannelCode(Integer channelCode) {
        return payStrategyMap.get(channelCode);
    }

}
