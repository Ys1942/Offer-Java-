/**������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�*/

import java.util.Stack;

public class Main5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
//    public int pop() {
//    	while(!stack1.isEmpty()){
//    		stack2.push(stack1.pop());
//    	}
//    	int i = stack2.pop();
//    	while(!stack2.isEmpty()){
//    		stack1.push(stack2.pop());
//    	}
//    	return i;
//    }
    public int pop(){
    	if(stack2.isEmpty()){
    		while(!stack1.isEmpty()){
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    }
    public static void main(String[] args) {
		Main5 m = new Main5();
		m.push(1);
		m.push(2);
		m.push(3);
		System.out.println(m.pop());
		m.push(4);
		m.push(5);
		m.push(6);
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
	}
}

/*������к�ջ��LIFO��FIFO����*/