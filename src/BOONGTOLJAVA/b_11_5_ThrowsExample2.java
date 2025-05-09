package BOONGTOLJAVA;

public class b_11_5_ThrowsExample2 {
    public static void main(String[] args) throws Exception {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
// throws Exception은 Java에서 메서드가 예외를 발생시킬 가능성이 있음을 선언하는 키워드입니다.
// 메서드에 throws Exception을 선언하면, 해당 메서드가 Exception 클래스를 상속받은 모든 예외를 던질 수 있음을 나타냅니다.
// throws 키워드는 "이 메서드를 호출할 때 특정 예외가 발생할 수 있으며, 이 메서드 내부에서 처리하지 않고 호출자에게 처리를 위임한다"는 의미를 가집니다.
// main 메서드 역시 이 예외를 직접 처리하지 않고, throws Exception로 선언함으로써 예외를 상위(여기서는 최상위인 JVM)로 넘깁니다.