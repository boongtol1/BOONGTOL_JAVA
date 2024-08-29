package BOONGTOLJAVA;

public class b_3_8_BitLogicExample {
    public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45)); // 1의 보수를 취한 후 1을 더하면 2의 보수로 어떤 양수의 -부호 붙인 수가 된다. 여기서는 1의 보수만 취했으므로 어떤 양수에 -부호 붙인것에 -1인 수가 나온다!
		System.out.println("-------------------------------");

		byte receiveData = -120;

		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);

		//방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);

		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}
}

// Java에서 char,byte와 같은 작은 크기의 정수형 데이터 타입을 처리할 때, 일반적으로 산술 연산이나 비트 연산을 수행하기 위해서는 **32비트 정수형(int)**으로 자동으로 확장됩니다.
// Byte.toUnsignedInt() 메서드는 Java에서 제공하는 메서드로, 부호 있는 byte 값을 부호 없는 int 값으로 변환할 때 사용됩니다.