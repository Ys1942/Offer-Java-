/**
 * ����һ����������������һ������S��
 * �������в�����������ʹ�����ǵĺ�������S��
 * ����ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * */
import java.util.ArrayList;
public class Main42 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		if(array == null || array.length<2)
			return new ArrayList<>();
        int low = 0;
        int high = array.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(low<high){
        	int tmp = array[low]+array[high];
        	if(tmp == sum){
        		list.add(array[low]);
        		list.add(array[high]);
        		break;
        	}
        	else if(tmp<sum) {
        		low++;
        	}
        	else
        		high--;
        }
        return list;
    }
}
