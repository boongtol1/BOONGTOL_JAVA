package BOONGTOL_TOJAVA;

import java.io.FileInputStream;
import java.io.IOException;

public class b_8_6_FileInputStreamEx {
    public static void main(String[] args) {
		byte b[] = new byte [7]; // 비어 있는 byte 배열 // new byte[7] 는 [0, 0, 0, 0, 0, 0, 0] 으로 구성된 배열을 만듭니다.
		try {
			// "c:\\Temp\\test.out" 파일을 읽어 배열 b에 저장
			FileInputStream fin = new FileInputStream("/Users/boongtol/Desktop/test.txt");
			int n=0, c;
			while((c = fin.read())!= -1) { // -1은 파일 끝(EOF)
				b[n] = (byte)c; // 읽은 바이트를 배열에 저장
				n++;
			}
			// 배열 b[]의 바이트 값을 모두 화면에 출력
			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			
			fin.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
		}
	}
}
