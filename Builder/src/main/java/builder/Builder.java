package builder;

import product.Product;

import java.util.List;

/**
 * @Description: 抽象建造者类
 * @Auther: ThomasWu
 * @Date: 2018/11/4 21:40
 * @Email:1414924381@qq.com
 */
public abstract class Builder {
    Product product = new Product();

    public abstract Product buildProduct();


}
