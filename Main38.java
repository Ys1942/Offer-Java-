/**
 * ����һ�ö����������������ȡ�
 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·����
 * �·���ĳ���Ϊ������ȡ�
 * */
public class Main38 {
	public int TreeDepth(TreeNode root) {
        if(root == null)
        	return 0;
        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        return (leftDepth > rightDepth) ? (leftDepth+1):(rightDepth+1); 
    }
}
