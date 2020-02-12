package step01_기초;

public class Test4 {
	/*
	 * 각각 변수에 대입하여 출력하세요 이름 : 이순신 나이 : 25세 부서 : 개발부 성적 : 87.4점
	 */
	public static void main(String[] args) {
		String name = "이순신";
		int age = 25;
		String part = "개발부";
		float score = 87.5f;

		System.out.println("이름 :" + name);
		System.out.print("나이 :" + age + "세\n");
		System.out.printf("부서 :%s\n" + "성적 :%.1f점 ", part, score);

	}

}
