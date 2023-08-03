import cn.kgc.stack.JiChaoStack;

/**
 * @ClassName Main3
 * @Description TODO
 * @Author li.liu
 * @Date 2023/8/2 14:40
 * @Version 1.0
 */
public class Main3 {
    public static void main(String[] args) {
        String exp = "12-4+3*5/2-1";
        //请使用你自己编写的栈，完成表达式的计算.
        // 使用两个栈，第一个栈放 数字，第二个栈 符号
        JiChaoStack s1 = new JiChaoStack(exp.length());
        JiChaoStack s2 = new JiChaoStack(exp.length());
        //判断是数字还是字符 ，我们支持 + - * /
        String s = "";
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i); // 获取到每一个字符
            if(s1.isOpr(c) == 1) { // 是符号
                s1.push(Integer.parseInt(s)); // 上一个数字
                s = "";
                if(s2.isEmpty()){ // 符号栈为空
                    s2.push(c); // 压入 -
                }else {
                 //你查看取出栈顶的符号  与现在的 符号进行对比
                    char top = (char)s2.getTop();
                    //判断<=
                    if(s2.gtlt(c) <= s2.gtlt(top)){  //- +
                        int opr = s2.pop();
                        int num1 = s1.pop();
                        int num2 = s1.pop();
                        int result = s2.cal(num1, num2, (char)opr);
                        s1.push(result); // 把结果压入到数字栈
                        s2.push(c); //压入到符号栈
                    }else {
                        // >
                        s2.push(c);
                    }
                }
            }else {
                //是数字
                s+=c;
                if(i == exp.length()-1){
                    s1.push(Integer.parseInt(s));
                }
            }
        }

        // + -
        while (!s2.isEmpty()){
            int opr = s2.pop();
            int num1 = s1.pop();
            int num2 = s1.pop();
            int result = s2.cal(num1, num2, (char) opr);
            s1.push(result);
        }

        System.out.println("结果 = " + s1.pop());


    }
}
