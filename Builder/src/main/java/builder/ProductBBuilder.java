package builder;

import product.Part1;
import product.Part2;
import product.Product;

/**
 * @Description: ProductBBuilder
 * @Auther: ThomasWu
 * @Date: 2018/11/4 21:53
 * @Email:1414924381@qq.com
 */
public class ProductBBuilder extends Builder {

    @Override
    public Product buildProduct() {
        product.getPartList().add(new Part2());
        product.getPartList().add(new Part2());
        return product;
    }
}
