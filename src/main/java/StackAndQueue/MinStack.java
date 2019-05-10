package StackAndQueue;
/**
 * @Authror lanoipd
 * @Date 2019/5/10 12:38
 */

import common.Stack.IStack;
import common.Stack.Stack;

/**
 * @author
 * @title: MinStack
 * @projectName tddLeetocde
 * @description: 实现一个特殊的栈，在基本功能基础上，实现能返回栈的最小元素的操作，时间复杂度要求O(1);
 * 思路：可以利用两个栈，一个栈保存当前元素，一个栈保存最小值。
 * @date 2019/5/1012:38
 */
public class MinStack {

    //保存当前元素
    private IStack<Integer> stackData;
    //保存最小元素
    private IStack<Integer> stackMin;

    public MinStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    /**
     * 返回栈的最小值
     * @return int
     * @Author lanoipd
     * @Date 2019/5/10 13:44
     */
    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return this.stackMin.peek();

    }

    public void push(int num) {
        if (stackMin.isEmpty()) {
            stackMin.push(num);
        } else if (num <= this.getMin()) {
            this.stackMin.push(num);
        }
        this.stackData.push(num);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        int res = this.stackData.pop();
        if (res == this.getMin()) {
            this.stackMin.pop();
        }
        return res;
    }
    public boolean isEmpty(){
        return (this.stackData.isEmpty());
    }

}
