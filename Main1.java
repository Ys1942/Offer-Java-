/**��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
�ж��������Ƿ��и�������*/
public class Main1 {
	public boolean Find(int target, int [][] array) {
		int rIndex = 0;
		int cIndex = array[0].length-1;
		for (int i = rIndex; i <array.length; i++) {
			for (int j = cIndex; j >=0;j--) {
				if(array[i][j]==target)
					return true;
				else if(array[i][j] > target){
					
					continue;
				}
				else if(array[i][j] < target){
					cIndex = j;
					break;
				}
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] array=new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(new Main1().Find(9,array));
		System.out.println(new Main1().Find(13,array));
	}
}
/*���� ���ң�ע�������˳�����*/
/*��ά����ȡ������array.length,ȡ����:array[0].length*/
