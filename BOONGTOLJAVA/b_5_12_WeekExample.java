package BOONGTOLJAVA;

import java.util.Calendar;

import BOONGTOLJAVA.b_5_12_Week.Week;

public class b_5_12_WeekExample {
    public static void main(String[] args) {
		//Week 열거 타입 변수 선언
		Week today = null;
 
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1: today = Week.SUNDAY ; break;
			case 2: today = Week.MONDAY ; break;
			case 3: today = Week.TUESDAY ; break;
			case 4: today = Week.WEDNESDAY ; break;
			case 5: today = Week.THURSDAY ; break;
			case 6: today = Week.FRIDAY ; break;
			case 7: today = Week.SATURDAY ; break;
		}
		
		//열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}
}

// 자바에서는 int, String과 같은 기본 데이터 타입 외에도 사용자 정의 타입을 만들 수 있습니다. enum 키워드를 사용하여 이러한 새로운 타입을 정의하게 되며, 이를 열거형 타입이라고 부릅니다.
// SUNDAY, MONDAY, TUESDAY 등은 Week 열거형 타입에 포함된 고정된 값(상수)들을 의미합니다.
// Calendar는 자바의 내장된 클래스로, 사용자 지정 데이터 타입이 아니라 자바 표준 라이브러리에서 제공하는 클래스 타입입니다. Calendar는 날짜와 시간을 처리하기 위한 참조형 데이터 타입입니다.
// Calendar 클래스의 getInstance() 메서드를 호출하여 현재 날짜와 시간을 가져오는 Calendar 객체를 생성합니다.