/**
 * ���������������������������������ϳɺ������
 * ��Ȼ������Ҫ�ϳɺ���������㵥����������
 * */

public class Main16 {
	/**�ݹ�*/
	public static ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		if(list1.val<list2.val){
			list1.next = Merge(list1.next, list2);
			return list1;
		}
		else{
			list2.next = Merge(list1, list2.next);
			return list2;
		}
    }
	/**�ǵݹ�*/
	public static ListNode Merge1(ListNode list1,ListNode list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
        ListNode head = new ListNode(-1);
        ListNode pNode = head;
        while(list1 != null && list2 != null){
        	if(list1.val<list2.val){
        		pNode.next = list1;
        		pNode = list1;
        		list1 = list1.next;
        	}
        	else{
        		pNode.next = list2;
        		pNode = list2;
        		list2 = list2.next;
        	}
        	pNode.next = null;
        }
        if(list2 != null)
        	list1 = list2;
        pNode.next = list1;
        return head.next;
    }
}
