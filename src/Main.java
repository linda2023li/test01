import cn.kgc.stack.JiChaoStack;

import java.util.Stack;

/**
 * @ClassName ${NAME}
 * @Description TODO
 * @Author li.liu
 * @Date 2023/8/2 14:24
 * @Version 1.0
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JiChaoStack jiChaoStack = new JiChaoStack(5);

        for (int i = 0; i < 5; i++) {
            jiChaoStack.push(i); // 0 1 2 3 4
        }

//        jiChaoStack.push(111);

        for (int i = 0; i < jiChaoStack.getMaxSize(); i++) {
            System.out.println(jiChaoStack.pop());
        }

        jiChaoStack.pop();
    }
}