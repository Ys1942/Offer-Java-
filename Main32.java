import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * */
public class Main32 {
	public String PrintMinNumber(int [] numbers) {
		int n = numbers.length;
		String result = "";
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String s1 = o1+""+o2;
				String s2 = o2+""+o1;
				return s1.compareTo(s2);
			}
		});
		for (Integer integer : list) {
			result += integer;
		}
		return result;
    }
}
