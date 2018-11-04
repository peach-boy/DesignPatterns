import builder.Builder;
import builder.ProductABuilder;
import builder.ProductBBuilder;
import product.Part;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2018/11/4 22:22
 * @Email:1414924381@qq.com
 */
public class Client {
    public static void main(String[] args) {
        Builder productABuilder = new ProductABuilder();
        productABuilder.buildProduct().getPartList().forEach(item -> {
            System.out.println(item.getName());
        });

        System.out.println();
        Builder productBBuilder = new ProductBBuilder();
        productBBuilder.buildProduct().getPartList().forEach(item -> {
            System.out.println(item.getName());
        });

    }
}
