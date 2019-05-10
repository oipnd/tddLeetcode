package common.Stack;
/**
 * @Authror lanoipd
 * @Date 2019/5/10 12:06
 */

/**
 * @title: IStack
 * @projectName tddLeetocde
 * @description: 栈接口定义
 * @author yyy
 * @date 2019/5/1012:06
 */
public interface IStack<T> {
    /**
     * 入栈
     * @Author lanoipd
     * @param item :
     * @return void
     * @Date 2019/5/10 12:10
     */
    void push(T item);

    /**
     * 出栈
     * @Author lanoipd
     * @return T
     * @Date 2019/5/10 12:11
     */
    T pop();

    /**
     * 查看栈顶元素
     * @Author lanoipd
     * @return T
     * @Date 2019/5/10 12:08
     */
    T peek();

    /**
     * 判断栈空
     * @Author lanoipd
     * @return boolean
     * @Date 2019/5/10 12:08
     */
    boolean isEmpty();
}
