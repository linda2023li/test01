package cn.kgc.stack;

/**
 * @ClassName JiChaoStack
 * @Description  这是我们自己的栈.
 * @Author li.liu
 * @Date 2023/8/2 14:24
 * @Version 1.0
 */
public class JiChaoStack {

    private  int [] stack; // 数组特点： 固定大小
    private int maxSize ; // 栈的大小

    public int getMaxSize() { // 获取栈的大小
        return maxSize;
    }

    public JiChaoStack(int maxSize) { // 使用者给我传递一个栈的大小
        this.maxSize = maxSize;
        stack = new int[maxSize]; // 分配空间
    }

    private  int top =-1; // 栈顶如果为 -1，说明栈空的

    // 压栈  入栈
    public void push(int c){
        //判断栈是否满了！！！！
        if(top >= maxSize-1) {
            throw new RuntimeException("栈满了");
        }
        top++;
        stack[top] = c;
    }
    // 弹栈  出栈
    public int pop(){
        //判断栈是否空的
        if(top == -1){
            throw new RuntimeException("栈空的");
        }
        int data = stack[top];
        top--;
        return data;
    }

    //判断是否是字符
    public int isOpr(char c){
        if(c=='+' || c=='-' || c== '*' || c =='/') return 1;
        else return -1;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return top == -1;
    }
    //查看栈顶的元素
    public int getTop(){
        return stack[top];
    }
    //符号的优先级
    public int gtlt(char c){
        if(c=='+' || c=='-') return 0;
        else if (c=='*' || c=='/') return 1;
        else return -1;
    }
    //计算方法
    // 12 4===> 4 12 + -
    public int cal(int num1,int num2,char opr){
        int result = -1;
        switch (opr){
            case '+':
                result =  num1 + num2;
                break;
            case '-':
                result = num2 - num1;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 / num1;
                break;
        }
        return result;
    }
}
