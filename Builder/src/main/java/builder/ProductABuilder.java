package builder;

import builder.Builder;
import product.Part1;
import product.Product;


/**
 * @Description: ProductABuilder
 * @Auther: ThomasWu
 * @Date: 2018/11/4 21:44
 * @Email:1414924381@qq.com
 */
public class ProductABuilder extends Builder {

    @Override
    public Product buildProduct() {
        product.getPartList().add(new Part1());
        product.getPartList().add(new Part1());
        return product;
    }
}
