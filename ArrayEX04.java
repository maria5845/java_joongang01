package step05_�迭;

public class ArrayEX04 {

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = Integer.parseInt(args[0]);
		num[1] = Integer.parseInt(args[1]);
		num[2] = Integer.parseInt(args[2]);

		int max = num[0];
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
			if (num[i] < min)
				min = num[i];

		}
		System.out.println("�ִ밪 :" +max);
		System.out.println("�ּҰ� :" +min);
	}

}
