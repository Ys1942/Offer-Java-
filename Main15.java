/**
 * ����һ��������ת��������������ı�ͷ��
 * (ListNode ��Main3�ж������)
 * */

public class Main15 {
	/**���õݹ�*/
	public ListNode ReverseList1(ListNode head) {
		if(head == null)
			return null;
		ListNode p = head.next;
		ListNode temp = null;
		ListNode q = head;
		q.next = null;
		while(p != null){
			temp = p.next;
			p.next = q;
			q = p;
			p = temp;
		}
		return q;
    }
	/**�õݹ�*/
	public ListNode ReverseList(ListNode head) {
		if(head == null)
			return null;
		ListNode p = head.next;
		ListNode q = head;
		q.next = null;
		return re(p, q);
    }
	public static ListNode re(ListNode p,ListNode q){
		if(p != null){
			ListNode temp = p.next;
			p.next = q;
			return re(temp, p);
		}
		else
			return q;
	}
}
