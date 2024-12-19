package BOONGTOLJAVA;

public class b_3_3_OverflowUnderflowExample {
    public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) { //{ }를 5번 반복 실행	// i++: i를 1 증가시키는 일을 나중에 합니다.
			var1++; // ++ 연산은 var1의 값을 1 증가시킨다.	// ++i: i를 1 증가시키는 일을 바로 합니다.	
					// Key?--> 증감 연산이 수행되는 순간이 존재할수 있는 시간의 범위 설정해서 나중과 바로를 해석하기!
			System.out.println("var1: " + var1);
		}
		System.out.println("-----------------------");

		byte var2 = -125;
		for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
			var2--; //-- 연산은 var2의 값을 1 감소시킨다.
			System.out.println("var2: " + var2);
		}
	}
}
