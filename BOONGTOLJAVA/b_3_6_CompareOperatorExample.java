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
// 자바에서 char 타입을 비교하거나 수학적 연산을 수행할 때, char는 자동으로 int 타입으로 변환됩니다. 이 변환은 char 값을 해당 유니코드 값(정수)으로 취급하기 때문에 발생합니다. 
// 따라서, 두 char 값 간의 비교는 실제로 이 정수 값들 간의 비교가 됩니다.
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);

		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
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
