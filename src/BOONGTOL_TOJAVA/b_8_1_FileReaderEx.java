package BOONGTOL_TOJAVA;

import java.io.FileReader;
import java.io.IOException;

public class b_8_1_FileReaderEx {
    public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("/Users/boongtol/Desktop/test.txt"); // 문자 입력 스트림 생성
			int c;
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽는다.
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

// try-catch 문에서 try 안에는 예외가 발생할 가능성이 있는 코드를 입력한다.
// catch 안에는 try 에서 예외가 발생했을때 출력할 것들을 적는다.
// 너 말처럼, try 안에서 예외가 발생하지 않으면 catch 블록은 아예 실행되지 않아. 곧 try 부분만 실행되고 만다.

