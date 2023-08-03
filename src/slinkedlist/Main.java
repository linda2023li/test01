package slinkedlist;

/**
 * @ClassName Main
 * @Description TODO
 * @Author li.liu
 * @Date 2023/8/3 12:05
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ProductNode p1 = new ProductNode(1,"aa",11);
        ProductNode p2 = new ProductNode(2,"bb",11);
        ProductNode p3 = new ProductNode(3,"cc",11);
        ProductNode p4 = new ProductNode(4,"dd",11);
        ProductNode p5 = new ProductNode(5,"ee",11);

        ZhuBoYuLinkedList zhuBoYuLinkedList = new ZhuBoYuLinkedList(); // 单向链表
//        zhuBoYuLinkedList.addLast(p1);
//        zhuBoYuLinkedList.addLast(p5);
//        zhuBoYuLinkedList.addLast(p2);
//        zhuBoYuLinkedList.addLast(p4);
//        zhuBoYuLinkedList.addLast(p3);

        zhuBoYuLinkedList.addIndex(p1);
        zhuBoYuLinkedList.addIndex(p5);
        zhuBoYuLinkedList.addIndex(p2);
        zhuBoYuLinkedList.addIndex(p4);
        zhuBoYuLinkedList.addIndex(p3);

        ProductNode p = new ProductNode(2, "苹果", 10000);
        zhuBoYuLinkedList.update(p);
        zhuBoYuLinkedList.delete(3);

        zhuBoYuLinkedList.selectAll();

        zhuBoYuLinkedList.getSize();
    }
}
