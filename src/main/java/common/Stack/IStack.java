package common.Stack;
/**
 * @Authror lanoipd
 * @Date 2019/5/10 12:06
 */

/**
 * @author yyy
 * @title: IStack
 * @projectName tddLeetocde
 * @description: 栈接口定义
 * @date 2019/5/1012:06
 */
public interface IStack<T> {
    /**
     * 入栈
     *
     * @param item :
     * @return void
     * @Author lanoipd
     * @Date 2019/5/10 12:10
     */
    void push(T item);

    /**
     * 出栈
     *
     * @return T
     * @Author lanoipd
     * @Date 2019/5/10 12:11
     */
    T pop();

    /**
     * 查看栈顶元素
     *
     * @return T
     * @Author lanoipd
     * @Date 2019/5/10 12:08
     */
    T peek();

    /**
     * 判断栈空
     *
     * @return boolean
     * @Author lanoipd
     * @Date 2019/5/10 12:08
     */
    boolean isEmpty();
}
