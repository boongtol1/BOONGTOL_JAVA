package BOONGTOLJAVA;

public class b_11_6_Account {
    private long balance;
	
	public b_11_6_Account() { }

	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws b_11_6_InsufficientException {
		if(balance < money) {
			throw new b_11_6_InsufficientException("잔고 부족: "+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}
// 기본 생성자는 특별한 초기화를 하지 않으나, 객체 생성 시 balance는 0으로 초기화됩니다(기본값).
// throws 키워드는 메서드 선언부에서 "이 메서드가 특정 예외를 발생시킬 가능성이 있다"는 점을 명시적으로 나타내며, 그 예외에 대한 처리를 이 메서드를 호출하는 쪽에 **위임(전가)**하는 역할을 합니다.
// 즉, throws는 단순히 "이 메서드가 예외를 던질 수 있다"는 가능성을 알리는 것에 그치지 않고, 그 예외에 대한 처리 책임을 호출자에게 미루는 의미도 담고 있습니다.

// 현재 메서드:
// 특정 작업을 수행하다가 예외 상황(오류 상황)이 발생했다고 가정해봅시다. 이때 현재 메서드는 스스로 이 문제를 해결하지 않고 throw 키워드를 통해 예외를 발생시킵니다. 그러면 현재 메서드는 더 이상 실행을 계속하지 못합니다.

// 상위 호출자:
// 이 메서드를 호출한 쪽(상위 메서드 또는 상위 코드)이 있습니다. 예를 들어, main() 메서드가 methodA()를 호출했고, methodA()가 methodB()를 호출했는데 methodB()에서 예외가 발생했다면, 이 예외는 methodB()를 호출한 methodA()로 전달됩니다.

// 예외 처리 위임:
// 예외가 상위 호출자로 넘어가면, 이제 methodA()는 이 예외를 어떻게 처리할지 결정해야 합니다.

// 만약 methodA() 내부에서 try-catch 구문으로 해당 예외를 처리한다면 여기서 문제가 해결됩니다.
// 만약 methodA()도 처리할 수 없다면, 다시 throws를 통해 예외를 더 상위 호출자에게 넘겨서 최종적으로 처리하거나 프로그램이 종료될 때까지 "책임을 미루는" 구조가 가능합니다.


