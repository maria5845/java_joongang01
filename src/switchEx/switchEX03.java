package switchEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * arg로 입력된 month로 일수를 구하시오 
 * 3월은 31일까지 있습니다.
 * 
 */
public class switchEX03 {

	public static void main(String[] args) throws IOException {

		int mon;
		mon = Integer.parseInt(args[0]);
		int day = 0;

		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;

		case 2:
			day = 28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;

		}
		System.out.println(mon + "월은" + day + "일까지");
	}

}
