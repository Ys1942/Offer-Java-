/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 */
public class Main11 {
	public int NumberOf1(int n) {
		int count = 0;
		int flag = 1;
		while(flag!=0){
			if((n & flag)!=0)
				count++;
			flag = flag<<1;
		}
		return count;
    }
	public static int NumberOf12(int n){
		int count = 0;
		while(n!=0){
			count ++;
			n = n&(n-1);
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(new Main11().NumberOf1(0));
	}
}
