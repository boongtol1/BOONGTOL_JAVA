package BOONGTOLJAVA;

public class b_3_6_CompareOperatorExample {
    public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
			
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //65 < 66
		System.out.println("result4: " + result4);
// 자바에서 char 타입은 기본적으로 16비트 크기의 부호 없는 정수로, 유니코드 문자 값을 나타냅니다.
// 자바에서 char 타입을 비교하거나 수학적 연산을 수행할 때, char는 자동으로 int(32비트) 타입으로 변환됩니다. 

		int num3 = 1;	// 1 은 2진법으로 나타낼때 유한임!--> 메모 저장해둔거 참고
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);

		float num5 = 0.1f;	// 0.1 은 2진법으로 나타낼때 무한임!--> 메모 저장해둔거 참고(비트수만큼 최대한 저장한다! 적 사고!중요!)
		System.out.printf("num5의 실제 값: %.20f\n", num5); 
		double num6 = 0.1;// --> test2.java 에서 double 형의 미세한 차이 인식 가능!
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6); // 일반 출력에서는 모두 0.1 이라고 나온다!!--> test2.java 참고!
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		

		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}
}
// (논리 부정 연산자) ! : 이 연산자는 true를 false로, false를 true로 반전시킵니다.
// 네, 정확합니다! Java에서 서로 다른 데이터 타입을 비교할 때, 비트 수가 큰 (즉, 더 많은 메모리를 차지하고 더 정밀한 표현이 가능한) 데이터 타입으로 자동 형변환됩니다.
// 0.1을 이진수로 변환하면 무한히 반복되는 소수점 이하 숫자가 생깁니다. 그러나 컴퓨터는 유한한 비트로 이 숫자를 저장해야 하기 때문에, 이진수로 0.1을 근사치로 저장합니다. 이 과정에서 정밀도가 손실됩니다.