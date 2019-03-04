/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * */
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main22{
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	if(root == null)
    		return new ArrayList<Integer>(0);
    	ArrayList<Integer> list = new ArrayList<>();
    	Deque<TreeNode> deque = new LinkedList<TreeNode>();
    	deque.add(root);
    	while(!deque.isEmpty()){
    		TreeNode temp = deque.pop();
    		list.add(temp.val);
    		if(temp.left != null)
    			deque.add(temp.left);
    		if(temp.right != null)
    			deque.add(temp.right);
    	}
    	return list;
    }
}
