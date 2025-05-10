package BOONGTOLJAVA;

public class b_8_12_Bus implements b_8_12_Vehicle{
    @Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
