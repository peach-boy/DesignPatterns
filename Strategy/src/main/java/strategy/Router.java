package strategy;

import model.ChannelCodeEnum;

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
        router.payStrategyMap = new HashMap<>(3);
        router.payStrategyMap.put(ChannelCodeEnum.ALIPAY.getChannelCode(), new AlipayStrategy());
        router.payStrategyMap.put(ChannelCodeEnum.WECHAT.getChannelCode(), new WechatPayStrategy());
        router.payStrategyMap.put(ChannelCodeEnum.BALANCE.getChannelCode(), new BalancePayStrategy());
        return router;
    }


    public PayStrategy getByChannelCode(Integer channelCode) {
        return payStrategyMap.get(channelCode);
    }

}
