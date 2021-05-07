package model;

public enum ChannelEnum {

    ALIPAY(1, "支付宝"),
    WECHAT(2,  "微信"),
    BALANCE(3,  "余额");

    private Integer channelCode;
    private String desc;

    ChannelEnum(Integer channelCode, String desc) {
        this.channelCode = channelCode;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getChannelCode() {
        return channelCode;
    }
}
