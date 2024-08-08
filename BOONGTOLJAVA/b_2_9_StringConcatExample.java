package BOONGTOLJAVA;

public class b_2_9_StringConcatExample {
    public static void main(String[] args) {
		//숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);

		//결합 연산
		String result2 = 10 + 2 + "8";
		System.out.println("result2: " + result2);	// 기본은 왼쪽에서 부터 계산되는 규칙이 있다!

		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);

		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4);

		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);
	}
}
