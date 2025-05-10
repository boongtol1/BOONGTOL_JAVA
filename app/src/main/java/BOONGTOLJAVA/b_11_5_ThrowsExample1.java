package BOONGTOLJAVA;

public class b_11_5_ThrowsExample1 {
    public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
// throws Exception은 Java에서 메서드가 예외를 발생시킬 가능성이 있음을 선언하는 키워드입니다.
// 메서드에 throws Exception을 선언하면, 해당 메서드가 Exception 클래스를 상속받은 모든 예외를 던질 수 있음을 나타냅니다.