package BOONGTOLJAVA;

public class b_5_5_SubStringExample {
    public static void main(String[] args) {
		String ssn = "880815-1234567";
			
		String firstNum = ssn.substring(0, 6); // endindex -1 까지 실제로 생각한다!--> 파이썬과 유사!
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
