/**
 * ������к�ΪS�������������С�
 * �����ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 * */
import java.util.ArrayList;
public class Main41 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	     if(sum<3)
	    	 return new ArrayList<>();
	     int low = 1;
	     int high = 2;
	     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	     while(low<high && high<sum){
	    	 int tmp = (low+high)*(high-low+1)/2;
	    	 if(tmp == sum){
	    		 ArrayList<Integer> list = new ArrayList<>();
	    		 for (int i = low; i <= high; i++) {
					list.add(i);
				}
	    		 result.add(list);
	    		 high++;
	    	 }
	    	 else if(tmp < sum)
	    		 high++;
	    	 else
	    		 low++;
	     }
	     return result;
    }
}
