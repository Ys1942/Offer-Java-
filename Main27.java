/**
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���
 * abc,acb,bac,bca,cab��cba��
 * */
import java.util.ArrayList;
import java.util.TreeSet;
public class Main27 {
	private TreeSet<String> result = new TreeSet<>();
    public ArrayList<String> Permutation(String str){
    	if(str == null || str.length() == 0)
    		return new ArrayList<>(0);
    	ArrayList<String> result = new ArrayList<>();
    	char[] chars = str.toCharArray();
    	Permutation(chars,0);
    	result.addAll(this.result);
    	return result;
    }
    public void Permutation(char[] chars,int begin){
    	if(chars == null || chars.length == 0 || begin > chars.length-1)
    		return;
    	if(begin == chars.length-1)
    		result.add(String.valueOf(chars));
    	else
    	{
    		for (int i = begin; i < chars.length; i++) {
				swap(chars, begin, i);
				Permutation(chars, begin+1);
				swap(chars, begin, i);
			}
    	}
    }
    
    public static void swap(char[] ch, int i, int j){
    	char temp = ch[i];
    	ch[i] = ch[j];
    	ch[j] = temp;
    }
}