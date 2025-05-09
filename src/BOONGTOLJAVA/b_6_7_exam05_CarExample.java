package BOONGTOLJAVA;

public class b_6_7_exam05_CarExample {
    public static void main(String[] args) {
		b_6_7_exam05_Car car1 = new b_6_7_exam05_Car("자가용");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println();

		b_6_7_exam05_Car car2 = new b_6_7_exam05_Car("자가용", "빨강");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		b_6_7_exam05_Car car3 = new b_6_7_exam05_Car("택시", "검정", 200);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
	}
}
