package BOONGTOLJAVA;

public class b_7_4_exam01_Computer extends b_7_4_exam01_Calculator {
    //메소드 오버라이딩
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
