/**��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
 * �������쳲��������еĵ�n���0��ʼ����0��Ϊ0��
 * n<=39*/
public class Main7 {
	/**�ݹ飨Ч�����������*/
	public int Fibonacci(int n) {
		return n<2 ? n:Fibonacci(n-1)+Fibonacci(n-2);
    }
	/**����*/
	public int Fibonacci1(int n) {
		if(n<2)
			return n;
		int f0 = 0;
        int f1 = 1;
		int fn = 0;
        for(int i =2;i<=n;i++){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
