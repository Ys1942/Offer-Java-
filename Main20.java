/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min����
 * ��ʱ�临�Ӷ�ӦΪO��1������
 * */
import java.util.Iterator;
import java.util.Stack;
public class Main20 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	int min = 0;
	public void push(int node) {
		if(stack1.isEmpty()){
			min = node;
			stack1.push(node);
			stack2.push(node);
		}
		else{
			stack1.push(node);
			if(node<min)
				min = node;
			stack2.push(min);
		}
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    public int min() {
    	return stack2.peek();
    }
}
