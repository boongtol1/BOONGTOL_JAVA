package BOONGTOLJAVA;

public class b_3_9_BitShiftExample1 {
    public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;	//  num1 을 왼쪽으로 3비트이동! < 의 꼭짓점 방향!
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;	// num2 를 오른쪽으로 3비트 이동!
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);		
	}
}
// Math.pow 메서드는 double 형식을 반환합니다. 그래서 이 결과를 int 형식으로 변환하려면 (int)로 형 변환을 해야 합니다.
// 자바에서 자동 형 변환은 작은 크기의 데이터 타입이 더 큰 크기의 데이터 타입으로 변환될 때 발생합니다. 이는 산술 연산에서 흔히 발생합니다.
// -8을 이진수로 표현하면 1111 1000입니다.
// 오른쪽으로 3비트 이동(>> 3)하면, 결과는 1111 1111이 됩니다.
// 이 값은 10진수로 -1을 의미합니다.