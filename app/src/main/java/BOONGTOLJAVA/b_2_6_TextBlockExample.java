package BOONGTOLJAVA;

public class b_2_6_TextBlockExample {
    public static void main(String[] args) {
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";

		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
		""";

		System.out.println(str1);
		System.out.println("------------------------------------");
		System.out.println(str2);
		System.out.println("------------------------------------");
		String str = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		System.out.println(str);
	}
}
// 결론적으로, """는 텍스트 블록(여러 줄의 텍스트)을 정의하는 구문으로, 여러 줄 문자열을 손쉽게 작성하고 가독성을 높이는 데 유용한 기능입니다.
// \는 줄바꿈을 무시하고 두 번째 줄을 첫 번째 줄과 이어서 처리하게 됩니다.(텍스트 블록(""" 안에서!))
// 텍스트 블록(""")의 특징
// 자동 줄바꿈: 텍스트 블록 내부에서 줄을 나누면, 그 줄바꿈이 그대로 문자열에 반영됩니다.
// 자동 들여쓰기: 텍스트 블록 내부의 들여쓰기는 자동으로 무시되며, 필요한 만큼 들여쓰기 조절이 가능합니다.