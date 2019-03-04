import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * */
public class Main21 {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA.length == 0 || popA.length == 0)
			return false;
		Stack<Integer> stack = new Stack<>();
		int popIndex = 0;
		for (int i = 0; i < popA.length; i++) {
			stack.push(pushA[i]);
			while(!stack.isEmpty() && stack.peek().intValue() == popA[popIndex]){
				stack.pop();
				popIndex++;
			}
		}
	    return stack.isEmpty();
    }
}
