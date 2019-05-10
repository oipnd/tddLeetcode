package StackAndQueue;
/**
 * @Author lanoipd
 * @Date 2019/5/10 13:57
 */

import common.Stack.IStack;
import common.Stack.Stack;

/**
 * @title: StacksImplentsQueue
 * @projectName tddLeetocde
 * @description: 使用两个栈实现队列，支持add，pool，peek操作
 * 思路：入队直接入栈操作，出队和peek就是先出栈，然后弹出栈顶元素即可，但还需要再进行入栈操作，保持原数据顺序不变.但是这个重新入栈操作
 * 可以稍微优化下，就是不立即进行重新入栈，等到需要进队时再进行入栈操作。注意代码逻辑。
 * @author lanoipd
 * @date 2019/5/1013:57
 */
public class QueueImplementedByStacks {

    private IStack<Integer> stackPush;
    private IStack<Integer> stackPop;

    public QueueImplementedByStacks() {
        this.stackPop =new Stack<Integer>();
        this.stackPush=new Stack<Integer>();
    }

    public void add(int num){
        this.stackPush.push(num);
    }

    public int pool(){
        if (this.stackPush.isEmpty() && this.stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty.");
        }else if (this.stackPop.isEmpty()){         //在需要进行倒栈时进行非空判断，可以减少一些倒栈次数。
            while (!this.stackPush.isEmpty()){
                this.stackPop.push(this.stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if (this.stackPop.isEmpty() && this.stackPush.isEmpty()){
            throw new RuntimeException("Queue is empty.");
        }else if (this.stackPop.isEmpty()){
            while (!this.stackPush.isEmpty()){
                this.stackPop.push(this.stackPush.pop());
            }
        }
        return stackPop.peek();
    }
    public boolean isEmpty(){
        return (this.stackPop.isEmpty() && this.stackPush.isEmpty());
    }

}
