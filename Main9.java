/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 */
public class Main9 {
	public int JumpFloorII(int target) {
		if(target<3)
			return target;
		int num = 0;
		for (int i = 1; i < target; i++) {
			num += JumpFloorII(i);
		}
		return num+1;
    }
	public static void main(String[] args) {
		System.out.println(new Main9().JumpFloorII(3));
	}
}
