import java.util.ArrayList;

/**����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��*/

class ListNode {
	int val;
	ListNode next = null;
	
    ListNode(int val) {
    this.val = val;
       }
}

public class Main3 {
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		while(listNode !=null){
			list.add(0, listNode.val);
			listNode = listNode.next;
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		for (int i = 0; i < 5; i++) {
			ListNode lN = new ListNode(i+1);
			lN.next = listNode.next;
			listNode.next = lN;
		}
		
		ArrayList<Integer> list = printListFromTailToHead(listNode);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
/*��������ķ�ת*/
/*����ı�����ʽ�����������ͷ�巨��β�巨*/
