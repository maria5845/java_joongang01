package step02_연산자;

public class OperatorEx {

	public static void main(String[] args) {

		System.out.println(5 / 3); // 몫
		System.out.println(5 % 3); // 나머지

		int a = 5;
		String str = "korea";
		System.out.println(a == 5);
		System.out.println(a >= 5);
		System.out.println(a != 5);

		System.out.println(str == "korea" || str == "KOREA");
		// 앞에 값이 참이면 뒤에 값은 자동 무시한다

		int score = 57;

		System.out.println(score == 70 && score == 90);
		// 앞에 값이 거짓이면 뒤에 값은 자동 무시한다
		// 겹쳐지는 부분을 연산하는 것은 && , 나머지는 ||

		int c = 57;
		boolean sw = (c >= 70 && c < 90);
		System.out.println(sw);

		int k = 5;

		System.out.println(k++); // 5로 찍히지만 메모리에는 6이 저장됨 후위연산자
		// for 문에서만 후위 연산자를 사용함
		System.out.println(++k);// 7로 찍혀서 나오고 메모리도 7
		System.out.println(k);
		System.out.println(--k); // 6으로 찍혀서 나오고 메모리도 6
		System.out.println(k--); // 6으로 찍혀서 나오나 메모리에는 5로 저장됨

		int p = 3;
		p += 2;
		p *= 3;
		p -= 2;
		p %= 3;
		System.out.println(p);

		char code = '남';
		String gender;

		gender = (code == 'M' || code == '남') ? "man" : "woman";
		// 좌변의 자료형이 문자형
		System.out.println(gender);

		boolean ck = true;
		System.out.println(!ck);

		// 변수의 초기화

		String o = null; // 널값이 들어감 default String o = "";
		int u = 0;
		// int의 값은 0으로 default
		float t = 0.0f;
		char e = '\0';// \0 널문자랍디다.

		System.out.println(o + u + t + e);

	}

}
