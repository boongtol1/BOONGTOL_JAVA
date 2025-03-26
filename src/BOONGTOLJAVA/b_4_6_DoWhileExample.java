package BOONGTOLJAVA;

import java.util.Scanner;

public class b_4_6_DoWhileExample {
    public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") );

		System.out.println();
		System.out.println("프로그램 종료");
	}
}

// 일반적인 while 구문: 조건을 먼저 검사한 후, 참(true)일 때 반복문을 실행합니다.
// do while 구문: 코드를 먼저 실행하고, 그 다음에 조건식을 평가합니다.