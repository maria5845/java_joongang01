package object;

/*
 * overload method(중복함수) : 같은 이름의 함수 여러번 구현
 * 1. 반드시 함수 이름이 동일 
 * 2. 매개 변수 타입 이 다르거나 개수가 달라야함 
 */
public class OverloadEx {
	int x = 17;
	int y = 15;

	public int max() {

		return (x > y) ? x : y;

	}

	public int max(int x, int y) {

		return (x > y) ? x : y;

	}

	public float max(float x, float y) {

		return (x > y) ? x : y;

	}

	public static void main(String[] args) {
		OverloadEx ov = new OverloadEx();
		System.out.println("큰수:" + ov.max());
		System.out.println("큰수 :" + ov.max(75, 100));
		System.out.println("큰수 :" + ov.max(75.5f, 100.4f));
	}

}
