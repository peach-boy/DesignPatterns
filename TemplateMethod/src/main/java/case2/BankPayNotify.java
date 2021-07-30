package case2;

/**
 * @Auther: ThomasWu
 * @Date: 2021/5/8 11:20
 * @Description:
 */
public class BankPayNotify extends BankPayGateway {


    /**
     * 接收支付结果通知
     * @param payNotifyRequest
     * @return
     */
    public String payNotify(String payNotifyRequest) {

        return super.resolveNotify(payNotifyRequest, (data) -> {

            //接收支付结果通知业务处理
            System.out.println("支付结果通知业务处理");

            return "SUCCESS";
        });
    }



    /**
     * 接收退款结果通知
     * @param refundNotifyRequest
     * @return
     */
    public String refundNotify(String refundNotifyRequest) {

        return super.resolveNotify(refundNotifyRequest, (data) -> {

            //接收退款结果通知业务处理
            System.out.println("退款结果通知业务处理");


            return "SUCCESS";
        });
    }


    /**
     * 接收冲正结果通知
     * @param revertNotifyRequest
     * @return
     */
    public String revertNotify(String revertNotifyRequest) {

        return super.resolveNotify(revertNotifyRequest, (data) -> {

            //接收冲正结果通知业务处理
            System.out.println("冲正结果通知业务处理");


            return "SUCCESS";
        });
    }



}
