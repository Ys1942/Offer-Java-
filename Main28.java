import java.util.Random;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * */

public class Main28 {
//	public static int createRandom(int low, int high){
//		return new Random().nextInt(high-low+1)+low;
//	}
//	public static int partition(int[] list,int low, int high ){
//		int index = createRandom(low, high);
//		swap(list,low,index);
//		int tmp = list[low];
//		while(low<high){
//			while(low<high && list[high] >= tmp)
//				high--;
//			list[low] = list[high];
//			while(low<high && list[low] <= tmp)
//				low++;
//			list[high] = list[low];
//		}
//		list[low] = tmp;
//		return low;
//	}
	public static boolean checkMoreThanHalf(int[] numbers, int length, int centerVal){
		int times = 0;
		for (int i = 0; i < length; i++) {
			if(numbers[i] == centerVal)
				times ++;
		}
		if(times*2 > length)
			return true;
		return false;
	}
//	public int MoreThanHalfNum_Solution(int [] array) {
//        int length = array.length;
//        int middle = length >> 1;
//        int start = 0;
//        int end = length -1;
//        int index = partition(array, start, end);
//        while (index != middle){
//        	if(index > middle)
//        		index = partition(array, start, index-1);
//        	else
//        		index = partition(array, index+1, end);
//        }
//        int result = array[middle];
//        if(checkMoreThanHalf(array, length, result))
//        	return result;
//        return 0;
//    }
//	public static void swap(int[] ch, int i, int j){
//    	int temp = ch[i];
//    	ch[i] = ch[j];
//    	ch[j] = temp;
//    }
	public int MoreThanHalfNum_Solution(int [] array) {
		int length = array.length;
		int key = array[0];
		int times = 1;
		for (int i = 1; i < length; i++) {
			if(times == 0){
				key = array[i];
				times = 1;
			}
			else if(key == array[i])
				times++;
			else
				times--;
		}
		if(checkMoreThanHalf(array, length, key))
			return key;
		return 0;
	}
}
