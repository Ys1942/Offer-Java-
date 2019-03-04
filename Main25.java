/**
 * ����һ����������
 * ��ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬
 * ��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Main25 {
	public RandomListNode Clone(RandomListNode pHead)
    {
		RandomListNode p1 = pHead;
		RandomListNode p2 = pHead;
		RandomListNode temp = null;
		while(p1 != null){
			temp = new RandomListNode(p1.label);
			temp.next = p1.next;
			p1.next = temp;
			p1 = temp.next;
		}
		temp = null;
		while(p2 != null){
			temp = p2.next;
			if(p2.random != null)
				temp.random = p2.random.next;
			p2 = temp.next;
		}
		temp = null;
		RandomListNode s = new RandomListNode(0);
		RandomListNode s1 = s;
		while(pHead != null){
			temp = pHead.next;
			pHead.next = temp.next;
			temp.next = s.next;
			s.next = temp;
			s = s.next;
			pHead = pHead.next;
		}
		return s1.next;
    }
	
}
