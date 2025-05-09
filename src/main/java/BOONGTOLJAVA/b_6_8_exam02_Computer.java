package BOONGTOLJAVA;

public class b_6_8_exam02_Computer {
    //가변길이 매개변수를 갖는 메소드 선언
	int sum(int ... values) {
		//sum 변수 선언
		int sum = 0;
		
		//values는 배열 타입의 변수처럼 사용
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		//합산 결과를 리턴
		return sum;
	}
}
// 가변길이 매개변수(Variable-Length Arguments)는 메소드에 전달할 인자의 개수를 미리 정하지 않고, 호출할 때 여러 개의 인자를 가변적으로 전달할 수 있는 기능을 제공합니다.
// 네, 정확합니다! 자바에서 가변길이 매개변수(int... values)로 값이 전달되면, 전달된 값들은 자동으로 배열로 변환됩니다. 즉, 1, 2, 3과 같은 값들이 전달되면, values는 int[] 타입의 배열이 됩니다.
// 가변길이 매개변수로 배열을 직접 전달하면 그 배열이 그대로 사용됩니다. 즉, 가변길이 매개변수로 배열을 전달할 때 별도의 추가 변환 과정은 없고, 전달된 배열이 그대로 values에 할당됩니다.