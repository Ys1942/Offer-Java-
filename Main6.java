/**��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 *����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 *��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Main6 {
    public int minNumberInRotateArray(int [] array) {
    	if(array.length == 0)
    		return 0;
    	else if(array.length == 1){
    		return array[0];
    	}
    	else{
    		int i = 0;
    		for (i = 0; i < array.length-1; i++) {
				if(array[i]>array[i+1])
					return array[i+1];
			}
    		return array[0];
    	}
    }
    public static void main(String[] args) {
		int [] a = {3,4,5,6,7,1,2};
//		int[] a = {1,1,0,1,1};
		System.out.println(new Main6().minNumberInRotateArray(a));
	}
}

/*�������*/
/*Ѱ�����������*/