package object;

import java.util.Scanner;

public class ObjectEx07 {
	/*
	 * ***** ��ٸ� ���� ���� ���ϱ� ***** �غ��� �Է��Ͻÿ� : 5 ������ �Է��Ͻÿ� : 4 ���̸� �Է��Ͻÿ� : 3
	 * 
	 * ���� : 13.5 do while ��
	 * 
	 * �ѹ��� ��� �ұ��?(Y/Y)n *********���� �ϼ̽��ϴ� **********
	 * 
	 */
	public static void main(String[] args) {
		Trapzoid tp = new Trapzoid();
		char ans;
		Scanner sc = new Scanner(System.in);
		do {

			// �Է�ó��
			// ���ó��
			// �����ó��
			// ���ǰ˻�
			System.out.println("�غ��� �Է��Ͻÿ�:");
			int base = sc.nextInt();
			System.out.println("������ �Է��Ͻÿ�:");
			int top = sc.nextInt();
			System.out.println("���̸� �Է��Ͻÿ�:");
			int height = sc.nextInt();
			tp.setTrapzoid(base, top, height);// setTrapzoid �޼��带 ȣ���Ͽ�
			// ��ĳ�ʷ� �Էµ� ���� �����Ѵ�.

			// �Է�ó��

			System.out.println(tp.toString());
			// ���ó��

			System.out.println("�ѹ� �� ����ұ��?(y/Y)");
			ans = sc.next().charAt(0);

//			if (ans == 'y' || ans == 'Y') {
//				continue;
//
//			} else if (ans == 'n') {
//				System.out.println("***�����ϼ̽��ϴ�****");
//				break;
//			} �ʿ���� �ڵ� 
			// �����ó��

		} while (ans == 'y' || ans == 'Y');
       //���� �˻� 
		sc.close();
	}

	
/*
 * ---------------����---------------
 * 
 * 
 * int base, top, height 
 * char yn;
 * Scanner sc = new Scanner(System.in);
 * 
 *  do {
 *     System.out.println("**��ٸ����� ���� ���ϱ�***"  )
 *     System.out.println("�غ��� �Է��Ͻÿ�"  )
 *     base=sc.nextInt();
 *     System.out.println("������ �Է��Ͻÿ�"  )
 *     top=sc.nextInt();
 *     System.out.println("���̸�  �Է��Ͻÿ�"  )
 *     height=sc.nextInt();
 * 
 *     tz.setTrapzoid(base, top, height);
 *     System.out.println(tz.toStiring()) => toString ��� 
 * 
 * 
 *    System.out.println("�ѹ��� ����ұ��(y/Y)");
 *    yn=sc.next()charAt(0);
 *    } while(yn =='Y' || yn== 'y');
 *    
 *    System.out.println("******�����ϼ̽��ϴ�*****");
 * 
 * 
 * 
 */
}
