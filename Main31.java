/**
 * ��1 �� n ��1���ֵĴ���.���Ӷ�ΪO(logn)
 * */
public class Main31 {
	public int NumberOf1Between1AndN_Solution(int n) {
	    int count = 0;
	    long i = 1;
	    for (i = 1;  i <= n; i *= 10) {
			int a =(int)( n / i);
			int b = (int)(n % i);
			count += (a+8)/10*i;
			if(a%10 == 1)
				count += b+1;
		}
	    return count;
    }
}
