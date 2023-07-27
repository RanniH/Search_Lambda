package s.s.Stack;
abstract class IStack
{
    int MAX_SIZE = 5; /*最大栈长度。为5表示栈中最大容纳5个元素*/
    public abstract boolean push(int data);/*元素进栈，如果栈满返回false */
    public abstract int pop(); /*从栈中取数据。如果栈已经为空返回Integer.MIN_VALUE*/
    public abstract boolean isEmpty(); /*判断栈是否为空*/
    /* 显示栈中所有元素
     * 1.  如果栈不为空，显示：
     * 栈中元素有：
     * <显示每个元素，空格分隔，最后一个元素后换行>
     *
     * 2.  如果栈为空，显示：
     * 栈为空
     */
    public abstract void display();
}
public class Stack extends IStack{
    private int top;
    private int[] elements;
    public Stack() {
        elements = new int[MAX_SIZE];
        top = -1;
    }
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }
    @Override
    public boolean push(int data) {
        if (isFull()) {
            return false;
        }
        elements[++top] = data;
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return elements[top--];
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("栈为空");
        } else {
            System.out.println("栈中元素有");
            for (int i = 0; i < this.elements.length - 1; i++) {
                System.out.print(elements[i] + " ");
            }
            System.out.print(elements[elements.length - 1] + "\n");
        }
    }
    public static void main(String[] args) {

        System.out.println("**************栈测试开始*************");
        Stack stack = new Stack();
        int v = stack.pop();
        if (v==Integer.MIN_VALUE) {
            System.out.println("弹出失败，栈为空");
        } else {
            System.out.println("弹出数据为："+v);
        };
        stack.display();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        if (!stack.push(6)) {
            System.out.println("压栈失败，栈已满。失败的数据为:6");
        }
        stack.display();
        for (int i=0; ; i++) {
            if (stack.isEmpty()) break;
            System.out.println(i+". 弹出元素为:"+stack.pop());
        }
        stack.display();
        System.out.println("**************栈测试结束*************");
    }
}
