package BOONGTOLJAVA;

public class b_7_4_exam01_ComputerExample {
    public static void main(String[] args) {
		int r = 10;

		b_7_4_exam01_Calculator calculator = new b_7_4_exam01_Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();

		b_7_4_exam01_Computer computer = new b_7_4_exam01_Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}
}
