package DMU_TEST_TOJAVA;

public class B_2025_03_12_practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one[]=new int[3];
		for (int i = 0 ; i<one.length; i++) {
			one[i] = 10*i;
		}
		
		String two[] = {"하나","둘","셋"};
		for (String item : two) {
			System.out.println(item);
		}
		int j=0;
		while(j < one.length) {
			System.out.println(one[j]);
			j++;
		}

	}

}
