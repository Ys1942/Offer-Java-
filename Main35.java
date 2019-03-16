/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
 * ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
 * */
public class Main35 {
	public int InversePairs(int [] array) {
        if(array.length == 0 || array == null)
        	return 0;
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        return inversePairsCore(array, copy, 0, array.length-1);
    }
	public int inversePairsCore(int[] array,int[] copy, int low, int high){
		if(low == high)
			return 0;
		int mid = (low + high) >> 1;
		int leftCount = (inversePairsCore(array, copy, low, mid)%1000000007);
		int rightCount = (inversePairsCore(array, copy, mid+1, high)%1000000007);
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while(i>=low && j>=mid+1){
			if(array[i]>array[j]){
				count+=j-mid;
				if(count>=1000000007)
					count%=1000000007;
				copy[locCopy--] = array[i--];
			}
			else
				copy[locCopy--] = array[j--];
		}
		for (; i>=low; i--) {
			copy[locCopy--] = array[i];
		}
		for (; j>=mid+1; j--) {
			copy[locCopy--] = array[j];
		}
		System.arraycopy(copy, low, array, low, high-low+1);
		return (leftCount + rightCount +count)%1000000007;
	}
}
