package BOONGTOLJAVA;

public class b_11_6_AccountExample {
    public static void main(String[] args) {
		b_11_6_Account account = new b_11_6_Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());

		//출금하기
		try {
			account.withdraw(30000);
		} catch(b_11_6_InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
