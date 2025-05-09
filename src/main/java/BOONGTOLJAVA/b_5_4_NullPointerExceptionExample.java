package BOONGTOLJAVA;

public class b_5_4_NullPointerExceptionExample {
    public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] = 10; //NullPointerException

		String str = null;
		//System.out.println("총 문자 수: " + str.length() );//NullPointerException
	}
}

// null은 Java에서 모든 참조 타입(Reference Type)에 사용할 수 있습니다. 기본 타입은 사용 불가능!

// 메모리 저장 방식: 클래스 타입은 참조값(주소)을 저장하고, 기본 타입은 직접 값을 저장합니다.

// String이 클래스 타입인 이유는, Java에서 문자열을 단순한 데이터가 아닌 객체로 취급하여 다양한 기능과 메서드를 제공하기 위해 설계되었기 때문입니다.