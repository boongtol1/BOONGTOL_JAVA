package BOONGTOL_TOJAVA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_8_3_FileReadHangulFail {
    public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("/Users/boongtol/Desktop/test.txt"); // 파일로부터 바이트 입력 스트림 생성
			in = new InputStreamReader(fin, "US-ASCII");

			int c;

			System.out.println("인코딩 문자 집합은 " + in.getEncoding()); // 문자집합 출력
			while ((c = in.read()) != -1) { // 문자 단위로 읽는다.
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
