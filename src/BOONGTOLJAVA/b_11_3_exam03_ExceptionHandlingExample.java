package BOONGTOLJAVA;

public class b_11_3_exam03_ExceptionHandlingExample {
    public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
		}
	}
}
// | 연산자:
// NullPointerException이나 NumberFormatException 중 어떤 예외가 발생해도 해당 catch 블록이 실행됩니다.
// e는 두 예외 클래스의 공통 상위 클래스 타입으로 취급됩니다.