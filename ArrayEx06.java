package step05_배열;
// 2차원 배열 가변 배열 
public class ArrayEx06 {

	public static void main(String[] args) {
 int [][] num = new int [][] {
	 {10,40,70,100},
	 {20,50,80,110},
	 {30,40,90,120}
	
 };
 for (int i = 0; i<num.length ;i ++) {// 외부 for는 가로(행)수행
	 for (int j =0; j<num[i].length;j++) {// 내부 for는 세로(열) 수행 
		 
		 System.out.print(num[i][j]+"\t");
	 }
	 System.out.println();
 }
	}

}
