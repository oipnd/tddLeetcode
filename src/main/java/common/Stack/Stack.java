package common.Stack;
/**
 * @Authror lanoipd
 * @Date 2019/5/10 12:20
 */

import common.Node;

/**
 * @title: Stack
 * @projectName tddLeetocde
 * @description: 栈的实现类
 * @author yyy
 * @date 2019/5/1012:20
 */
public class Stack<T> implements IStack<T> {


    Node<T> top;
    private T item;

    public void push(T item) {
        this.item=item;
        Node<T> tNode=new Node<T>(item);
        tNode.next=top;
        top=tNode;
    }

    public T pop() {
        if (top!=null){
            T item=top.data;
            top=top.next;
            return item;
        }
        return null;
    }

    public T peek() {
        if (top!=null){
            return top.data;
        }
        return null;
    }

    public boolean isEmpty() {

        return (top==null);
    }
}
