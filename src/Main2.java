import cn.kgc.stack.JiChaoStack;

/**
 * @ClassName Main2
 * @Description TODO
 * @Author li.liu
 * @Date 2023/8/2 14:34
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        //用我们自己写的栈，判断一个字符串是否是回文.
        //  121 abbba

        String s = "aba";

        JiChaoStack jiChaoStack = new JiChaoStack(s.length()); // 栈的大小是我们字符串的长度

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 获取到每个字符
            jiChaoStack.push(c); // 压到栈中
        }

        StringBuilder ss = new StringBuilder(); // 从栈中取出来
        for (int i = 0; i < jiChaoStack.getMaxSize(); i++) {
            ss.append((char)jiChaoStack.pop());
        }


        System.out.println(ss.toString().equals(s)?"true":"false");

    }
}
