/**��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��*/
public class Main2 {
	public String replaceSpace(StringBuffer str) {
    	String str1 = "";
    	for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				str1+="%20";
			else
				str1+=str.charAt(i);
		}
    	return str1;
    }
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We Are Happy");
		System.out.println(new Main2().replaceSpace(sb));
	}
}
/*�����ַ�����String��StringBuffer������*/
/*�ж��Ƿ�Ϊ�ո�ķ���������' '�Ƚϲ���" " */
