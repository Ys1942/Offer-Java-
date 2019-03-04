/**
 * ����һ����������������е�����k����㡣
 * ���磬������1��2��3��4��5��6��������3�������4��
 * (ListNode ��Main3�ж������)
 * */
public class Main14 {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k <= 0)
			return null;
		ListNode ahead = head;
		ListNode behind = head;
		for (int i = 1; i < k; i++) {
			if(behind.next != null)
				behind = behind.next;
			else 
				return null;
		}
		while(behind.next != null){
			behind = behind.next;
			ahead = ahead.next;
		}
		return ahead;
    }
}
