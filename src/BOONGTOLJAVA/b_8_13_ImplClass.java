package BOONGTOLJAVA;

public class b_8_13_ImplClass implements b_8_13_InterfaceC{
    public void methodA() {
		System.out.println("methodA() 실행");
	}

	public void methodB() {
		System.out.println("methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
}
// 인터페이스 메서드 구현 시 @Override를 반드시 사용하지 않아도 되지만, 사용하는 것이 더 나은 코딩 스타일로 간주됩니다.
