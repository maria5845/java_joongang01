package step05_�迭;
// 2���� �迭 ���� �迭 
public class ArrayEx06 {

	public static void main(String[] args) {
 int [][] num = new int [][] {
	 {10,40,70,100},
	 {20,50,80,110},
	 {30,40,90,120}
	
 };
 for (int i = 0; i<num.length ;i ++) {// �ܺ� for�� ����(��)����
	 for (int j =0; j<num[i].length;j++) {// ���� for�� ����(��) ���� 
		 
		 System.out.print(num[i][j]+"\t");
	 }
	 System.out.println();
 }
	}

}
