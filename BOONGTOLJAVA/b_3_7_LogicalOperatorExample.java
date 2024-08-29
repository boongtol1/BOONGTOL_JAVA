package BOONGTOLJAVA;

public class b_3_7_LogicalOperatorExample {
    public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';

		if( (65<=charCode) & (charCode<=90) ) { // 여기서 단일 앰퍼샌드(&)가 사용됩니다. 이 연산자는 양쪽 조건을 모두 평가합니다.
			System.out.println("대문자이군요.");
		}
			
		if( (97<=charCode) && (charCode<=122) ) {   // 여기서는 논리 AND 연산자(&&)가 사용됩니다. 이 연산자는 첫 번째 조건이 false이면 두 번째 조건을 평가하지 않습니다.
			System.out.println("소문자이군요.");
		}

		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//----------------------------------------------------------

		int value = 6;
		//int value = 7;
			
		if( (value%2==0) | (value%3==0) ) { // 단일 논리 OR 연산자(|)를 사용하여 둘 중 하나라도 참이면 "2 또는 3의 배수이군요."가 출력됩니다. |는 양쪽 조건을 모두 평가합니다.
			System.out.println("2 또는 3의 배수이군요.");
		}

		boolean result = (value%2==0) || (value%3==0);  // 여기서는 논리 OR 연산자(||)가 사용됩니다. 첫 번째 조건이 참이면 두 번째 조건을 평가하지 않습니다.
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}
