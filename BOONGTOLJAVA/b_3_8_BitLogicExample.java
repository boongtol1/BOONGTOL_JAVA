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
// Java에서 & 연산자는 항상 비트 논리곱 연산자로 사용되지는 않습니다. & 연산자는 비트 논리곱 연산자로 주로 사용되지만, 논리 AND 연산자로도 사용될 수 있습니다.

// 이 방법이 작동하는 이유는 byte 값이 int로 확장될 때 부호 확장(상위 24 비트가 1로 채워지는 현상)이 일어나지만, 255와의 AND 연산으로 상위 24비트가 모두 0이 되어 원래의 8비트 패턴만 남기 때문입니다. 
// 이렇게 하면 원래 바이트의 비트 패턴을 유지하면서 부호 없는 정수로 해석할 수 있습니다.
// 255는 int 리터럴입니다. 기본적으로 정수 리터럴은 int 타입으로 간주되며, 이는 32비트 크기의 정수형 타입입니다.
// Java에서 비트 연산 (&, |, ^ 등)을 수행할 때, 피연산자들이 int 타입 또는 그 이상의 타입으로 자동으로 확장됩니다.(더 물어봐가면서 해라!)

// byte 값이 int로 확장될 때 **부호 확장(sign extension)**이 발생하는 이유는, Java가 음수 값을 정확하게 유지하면서 더 큰 데이터 타입으로 변환하기 위해서입니다. 
// 이 과정에서, 원래 byte 값이 음수일 경우, 부호를 유지하기 위해 상위 비트(추가된 비트들)가 1로 채워집니다.

// Byte.toUnsignedInt(receiveData)는 receiveData의 이진수 표현을 그대로 유지하면서, 그 값을 부호 없는 정수로 해석합니다.