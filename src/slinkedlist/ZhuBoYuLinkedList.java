package slinkedlist;

/**
 * @ClassName SLinkedList
 * @Description TODO
 * @Author li.liu
 * @Date 2023/8/3 12:05
 * @Version 1.0
 */
public class ZhuBoYuLinkedList {
    private ProductNode head = new ProductNode();// 数据域 都是默认值 + next域 null
    //添加

    /**
     * 在单向链表的最后添加.
     * @param newNode
     */
    public void addLast(ProductNode newNode){
        ProductNode tmp = head; // 头结点
        while (true){
            if (tmp.next == null) //头结点的next区域为null
                    break;
            tmp = tmp.next;
        }
        tmp.next = newNode; //
    }

    /**
     * 根据id进行排序. 并且如果重复的id，不插入.
     * @param newNode
     */
    public void addIndex(ProductNode newNode){
        ProductNode tmp = head; // 头结点
        boolean isFlag = false;
        while (true){
            if(tmp.next == null){
                break; // 链表是空的
            }
            //判断 你传递进来的id == 链表中已经存在
            if(tmp.next.id == newNode.id){
                isFlag = true;
                System.out.println("链表中已经存在该商品");
                break;
            }
            //判断 >
            if(tmp.next.id > newNode.id) {
                break; // 我已经定位到了我要插入的位置了
            }
            tmp = tmp.next;
        }
        if(!isFlag) {
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }
    //修改
    public void update(ProductNode newNode){
        ProductNode tmp = head;
        while (true){
            if(tmp.next == null){
                break;
            }
            if(tmp.next.id == newNode.id){
                tmp.next.name = newNode.name;
                tmp.next.price = newNode.price;
                break;
            }
            tmp = tmp.next;
        }
    }
    //删除
    public void delete(int id){
        ProductNode tmp = head;
        while (true){
            if(tmp.next == null){
                break;
            }
            if(tmp.next.id == id){
//                tmp.next //这个就是要删除的结点
                if(tmp.next !=null)
                    tmp.next = tmp.next.next;
                else
                     tmp.next = null; // 如果删除的是最后一个节点
                break;
            }
            tmp =tmp.next;
        }
    }
    //查询
    public void selectAll(){
        ProductNode tmp = head;
        while (true){
            if(tmp.next == null){
                break;
            }
            System.out.println("当前节点=>" + tmp.next +"\t\t 后继结点=>" + tmp.next.next);
            tmp = tmp.next;
        }
    }

    //统计单向链表中一共多少个节点，除了头结点
    public void getSize(){
        int size = 0; // 统计结点的个数
        ProductNode tmp = head;
        while (true){
            if(tmp.next == null){
                break;
            }
            size++;
            tmp = tmp.next;
        }
        System.out.println(size);
    }
}
