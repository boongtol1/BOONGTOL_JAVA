package BOONGTOLJAVA;

public class b_2_1_VariableExchangeExample {
    public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);   // 'x'는 정수로 해석가능하지만 정수로 해석해야 하는 상황이 아니면 일반 문자를 출력한다
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}   
}
