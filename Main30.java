/**
 * ��һ�����飬��������������������еĺ�
 * */
public class Main30 {
	public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0)
        	return 0;
        if(array.length == 1)
        	return array[0];
      //��̬�滮
        int max = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
			max = Math.max(max+array[i], array[i]);
			res = Math.max(max, res);
		}
        return res;
    }
}
