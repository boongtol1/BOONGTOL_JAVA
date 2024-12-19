package BOONGTOLJAVA;

public class b_7_4_exam02_SupersonicAirplaneExample {
    public static void main(String[] args) {
		b_7_4_exam02_SupersonicAirplane sa = new b_7_4_exam02_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = b_7_4_exam02_SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = b_7_4_exam02_SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
