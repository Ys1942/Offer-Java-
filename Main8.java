/**һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж���������
 * ���Ⱥ����ͬ�㲻ͬ�Ľ������
 * ��������쳲���������
 */
public class Main8 {
	public int JumpFloor(int target) {
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
