package common;
/**
 * @Authror lanoipd
 * @Date 2019/5/10 12:05
 */

/**
 * @title: Node
 * @projectName tddLeetocde
 * @description: TODO
 * @author yyy
 * @date 2019/5/1012:05
 */
public class Node<T> {
    public Node<T> next;
    public T data;

    /**
     * 构造方法
     * @Author lanoipd
     * @param data
     * @return
     * @Date 2019/5/10 12:05
     */
    public Node(T data) {
        this.data = data;
    }
}
