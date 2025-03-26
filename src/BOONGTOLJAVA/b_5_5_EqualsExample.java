package BOONGTOLJAVA;

public class b_5_5_EqualsExample {
    public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
			
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}

// 동일한 문자열 리터럴을 사용할 경우, Java는 메모리 절약을 위해 같은 객체를 참조하게 합니다. 
// 따라서 strVar1과 strVar2는 같은 메모리 주소를 참조하게 됩니다.
// 문자열 리터럴(String str = "홍길동";)을 사용할 경우, Java는 해당 리터럴이 String Pool에 이미 존재하는지 확인합니다.
// 만약 같은 내용의 문자열이 String Pool에 이미 존재하면, 새로운 객체를 생성하지 않고 기존 객체의 참조를 반환합니다.
// Java에서 같은 객체를 참조하는 변수들은 같은 메모리 주소를 가집니다. 즉, 같은 객체를 참조하면, 그 객체의 메모리 주소(참조값)도 동일합니다.