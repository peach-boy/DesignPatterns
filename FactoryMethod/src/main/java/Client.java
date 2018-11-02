/**
 * Created by Administrator on 2018/11/2.
 */

/**
 * @author xiantao.wu
 * @email xiantao.wu@guanaitong.com
 * @create 2018/11/218:09
 **/
public class Client {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.createProduct(Product1.class);
        product.doSomething();
    }
}
