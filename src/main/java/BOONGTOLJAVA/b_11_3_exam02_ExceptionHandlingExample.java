package BOONGTOLJAVA;

public class b_11_3_exam02_ExceptionHandlingExample {
    public static void main(String[] args) {
		String[] array = {"100", "1oo"};

		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(Exception e) {
				System.out.println("실행에 문제가 있습니다.");
			}
		}
	}
}


// Exception과 같은 추상적인 예외 클래스를 사용하는 경우:
// 예외가 다양하고 특별히 다른 처리가 필요 없을 때.
// 간단하게 모든 예외를 처리하고 싶을 때.
// 구체적인 예외 클래스를 사용하는 경우:
// 예외마다 다른 처리가 필요하거나, 문제의 원인을 명확히 기록하고 싶을 때.
// 코드의 가독성과 유지보수성을 높이고 싶을 때.
