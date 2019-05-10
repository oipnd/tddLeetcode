package StackAndQueue;
/**
 * @Author lanoipd
 * @Date 2019/5/10 15:05
 */

import common.Stack.Stack;
import sun.rmi.runtime.Log;

/**
 * @author lanoipd
 * @title: ReverseStack
 * @projectName tddLeetocde
 * @description: 利用递归和栈操作逆序一个栈
 * 思路：没难点，如果可以借助一个栈的话，很简单，但是此处要求只用递归，其实一样，因为递归就相当与一个递归调用栈，可以保存每步的信息。
 * @date 2019/5/1015:05
 */
public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        reverse(stack);
        System.out.println(stack.peek());

    }

    /**
     * @param stack :
     * @return void
     * @Author lanoipd
     * @Date 2019/5/10 16:28
     */
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(temp);

    }

    /**
     * @param stack :
     * @return int
     * @Author lanoipd
     * @Date 2019/5/10 16:28
     */
    private static int getAndRemoveLastElement(Stack<Integer> stack) {
        int res = stack.pop();
        if (stack.isEmpty()) {
            return res;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(res);
            return last;
        }
    }


}
