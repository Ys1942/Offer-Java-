/**
 *���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 *������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 *��������쳲���������
 * */
public class Main10 {
	public int RectCover(int target) {
		if(target<3)
			return target;
		int f1 = 1;
        int f2 = 2;
		int fn = 0;
        for(int i =3;i<=target;i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
