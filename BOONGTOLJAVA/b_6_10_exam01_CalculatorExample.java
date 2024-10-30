package BOONGTOLJAVA;

public class b_6_10_exam01_CalculatorExample {
    public static void main(String[] args) {
		double result1 = 10 * 10 * b_6_10_exam01_Calculator.pi;
		int result2 = b_6_10_exam01_Calculator.plus(10, 5);
		int result3 = b_6_10_exam01_Calculator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
// static 메서드에서 this 키워드를 사용할수 없는 이유?--> static 메서드가 호출될 때는 객체가 생성되지 않기 때문에, this가 가리킬 객체가 없기 때문입니다.
// 일반적으로 this 키워드는 미래에 객체가 만들어질때 그 객체를 가르키는데, static 메서드가 호출될 때는 객체가 생성되지 않기 때문에, this가 가리킬 객체가 없다!