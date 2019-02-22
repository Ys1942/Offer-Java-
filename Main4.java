/**����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 * ���ؽ������������ء�
 */

class TreeNode {
	int val;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode(int x) {
		this.val = x; 
	}
 }
public class Main4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int startPre, int endPre, int [] in, int startIn, int endIn){
    	if(startPre>endPre || startIn>endIn)
    		return null;
    	TreeNode node = new TreeNode(pre[startPre]);
    	for (int i = startIn; i <= endIn ; i++) {
			if(in[i] == pre[startPre]){
				node.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
				node.right = reConstructBinaryTree(pre, startPre+i-startIn+1, endPre, in, i+1, endIn);
				break;
			}
		}
    	return node;
    }
    public static void preOrderTraverse(TreeNode root){
		if(root == null)
			return;
		System.out.print(root.val+" ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
    public static void inOrderTraverse(TreeNode root){
    	if(root == null)
    		return;
    	inOrderTraverse(root.left);
    	System.out.print(root.val+" ");
    	inOrderTraverse(root.right);
    }
    public static void postOrderTraverse(TreeNode root){
		if(root == null)
			return;
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		System.out.print(root.val+" ");
	}
    public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = new Main4().reConstructBinaryTree(pre, in);
		preOrderTraverse(root);
		System.out.println();
		inOrderTraverse(root);
		System.out.println();
		postOrderTraverse(root);
	}
}

/*����������ı���*/