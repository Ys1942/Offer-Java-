import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Main19 {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		if(matrix == null || matrix.length == 0)
			return null;
		ArrayList<Integer> list = new ArrayList<>();
	    int rowStart = 0;
	    int colStart = 0;
	    int rowEnd = matrix.length-1;
	    int colEnd = matrix[0].length-1;
	    while(rowStart<=rowEnd&&colStart<=colEnd){
	    	for (int i = colStart; i <=colEnd; i++) 
	    		list.add(matrix[rowStart][i]);
	    	for (int i = rowStart+1; i <=rowEnd; i++) 
	    		list.add(matrix[i][colEnd]);
//	    			list.add(matrix[i][sy]);
	    	if(rowStart != rowEnd)
	    		for (int i = colEnd-1; i>=colStart; i--)
	    			list.add(matrix[rowEnd][i]);
	    	if(colStart != colEnd)
	    		for (int i = rowEnd-1; i>rowStart; i--)
	    			list.add(matrix[i][colStart]);
	    	rowStart++;
	    	colStart++;
	    	rowEnd--;
	    	colEnd--;
	    }
	    return list;
    }
}
