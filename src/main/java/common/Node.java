package common;
/**
 * @Authror lanoipd
 * @Date 2019/5/10 12:05
 */

/**
 * @author yyy
 * @title: Node
 * @projectName tddLeetocde
 * @description: TODO
 * @date 2019/5/1012:05
 */
public class Node<T> {
    public Node<T> next;
    public T data;

    /**
     * 构造方法
     *
     * @param data
     * @return
     * @Author lanoipd
     * @Date 2019/5/10 12:05
     */
    public Node(T data) {
        this.data = data;
    }
}
