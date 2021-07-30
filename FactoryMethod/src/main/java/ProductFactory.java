/**
 * Created by Administrator on 2018/11/2.
 */

/**
 * 产品工厂类
 *
 * @author xiantao.wu
 * @email xiantao.wu@guanaitong.com
 * @create 2018/11/217:42
 **/
public class ProductFactory {

    public <T extends Product> T createProduct(Class<T> claaz) {
        Product product = null;
        try {
            product = (Product) Class.forName(claaz.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}
