package BOONGTOLJAVA;

public class b_3_9_BitShiftExample2 {
    public static void main(String[] args) {
		int value = 772; //[00000000] [00000000] [00000011] [00000100]

		//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

		//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 바이트 부호 없는 값: " + int2);

		//우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [00000011]
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("세 번째 바이트 부호 없는 값: " + int3);

		//끝 1바이트만 읽음: [00000100]
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("네 번째 바이트 부호 없는 값: " + int4);
	}
}
// >>: 부호를 유지하면서 비트를 오른쪽으로 이동시킵니다. 왼쪽의 빈 자리에는 원래의 부호 비트가 채워집니다.
// >>>: 부호를 무시하고 비트를 오른쪽으로 이동시킵니다. 왼쪽의 빈 자리에는 무조건 0이 채워집니다.
// byte는 8비트만을 저장할 수 있기 때문에, 772의 이진 표현에서 하위 8비트(00000100)만 남게 됩니다.
// 나머지 상위 24비트(00000000 00000000 00000011)는 버려집니다.
// >> : 부호 비트를 유지하며 비트를 오른쪽으로 이동시킵니다. 음수의 경우, 왼쪽에 1이 채워집니다.
// >>> (Logical Right Shift): 부호 비트를 무시하고, 오른쪽으로 이동한 후 왼쪽에 무조건 0을 채웁니다. 양수와 음수 모두에서 부호에 관계없이 동일한 방식으로 작동합니다.