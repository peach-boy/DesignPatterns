package case2;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/8 11:23
 * @Description:
 */
public class BankPayGateway {



    public String resolveNotify(String notifyRequest, NotifyBusiness notifyBusiness) {
        String decryptNotifyRequest = this.handleRequest(notifyRequest);


        String responseStr = notifyBusiness.excute(decryptNotifyRequest);


        return this.buildResponse(responseStr);
    }

    /**
     * 请求解密
     * @param notifyRequest
     * @return
     */
    private String handleRequest(String notifyRequest) {
        //对密文解密处理
        return "解密后的明文";
    }

    /**
     * 响应加密
     * @param notifyResponse
     * @return
     */
    private String buildResponse(String notifyResponse) {
        //对响应加密处理
        return "加密后的响应";
    }

}
