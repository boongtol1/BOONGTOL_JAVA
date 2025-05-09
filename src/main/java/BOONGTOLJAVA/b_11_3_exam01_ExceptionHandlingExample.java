package BOONGTOLJAVA;

public class b_11_3_exam01_ExceptionHandlingExample {
    public static void main(String[] args) {
		String[] array = {"100", "1oo"};

		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			}
		}
	}
}

// 1. catch 블록 없이 사용 가능 (try-finally)
// 2. finally 블록 없이 사용 가능 (try-catch)
// int value = Integer.parseInt(array[i]);는 Java에서 문자열을 정수형 숫자로 변환하는 코드입니다.
// 따라서 첫 번째 catch 블록에서 선언된 변수 e는 해당 블록 내에서만 유효합니다.
// 두 번째 catch 블록에서 동일한 이름의 e를 선언해도 두 블록의 스코프가 다르기 때문에 충돌이 발생하지 않습니다.
