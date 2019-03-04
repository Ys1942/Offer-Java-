/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 */
public class Main23 {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
        	return false;
        if(sequence.length == 1)
        	return true;
        return judge(sequence, 0, sequence.length-1);
    }
	public boolean judge(int[] a, int start, int root){
		if(start>=root)
			return true;
		int i = start;
		while(i < root-1 && a[i] < a[root])
			i++;
		for (int j = i; j < root-1; j++) {
			if(a[j] < a[root])
				return false;
		}
		return judge(a, start, i-1) && judge(a, i, root-1);
	}
}
