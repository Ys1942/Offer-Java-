/**
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 * */
import java.util.ArrayList;

public class Main24 {
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
	private ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
        	return new ArrayList<>(0);
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
        	listAll.add(new ArrayList<>(list));
        if(root.left != null)
            FindPath(root.left, target);
        if(root.right != null)
            FindPath(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
}
