package product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2018/11/4 21:42
 * @Email:1414924381@qq.com
 */
public class Product {
    private List<Part> partList = new ArrayList<>();

    public List<Part> getPartList() {
        return partList;
    }

    public void setPartList(List partList) {
        this.partList = partList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partList=" + partList +
                '}';
    }
}
