package slinkedlist;

/**
 * @ClassName ProductNode
 * @Description TODO
 * @Author li.liu
 * @Date 2023/8/3 11:51
 * @Version 1.0
 */
public class ProductNode { // 商品结点
    //data域  => 关于商品的数据
    public int id;
    public String name;
    public double price;
    //next域
    public ProductNode next;

    public ProductNode() {
    }

    public ProductNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
