package StackAndQueue;
/**
 * @Author lanoipd
 * @Date 2019/5/10 17:55
 */

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
import common.Stack.Stack;

/**
 * @author lanoipd
 * @title: SortedStack
 * @projectName tddLeetocde
 * @description: 用一个栈实现另一个栈的排序(大的在栈顶)
 * 思路：若大于栈顶元素直接压栈，否则进行循环，弹出栈顶元素到另一个栈中，终止条件就是不小于栈顶元素。
 * 然后将另一个栈重新压栈。
 * @date 2019/5/1017:55
 */
public class SortedStack {

    public static void sort(Stack<Integer> stack) {
        Stack<Integer> stack1 = new Stack<>();

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!stack1.isEmpty() && cur < stack1.peek()) {
                stack.push(stack1.pop());
            }
            stack1.push(cur);
        }
        while (!stack1.isEmpty()){
            stack.push(stack1.pop());
    }
}

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        sort(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
