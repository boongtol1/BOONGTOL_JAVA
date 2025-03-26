package BOONGTOLJAVA;

public class b_6_7_exam05_Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    float md1;

    // 생성자 1: 모델명만 받는 생성자
    b_6_7_exam05_Car(String model) {
        this(model, "은색", 250); // 기본 색상과 최고 속도를 설정
    }

    // 생성자 2: 모델명과 색상 받는 생성자
    b_6_7_exam05_Car(String model, String color) {
        this(3.1f, color, 250); // 기본 최고 속도를 설정
    }

    // 생성자 3: 모델명, 색상, 최고 속도 모두 받는 생성자
    b_6_7_exam05_Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // 생성자 4: md1, 색상, 최고 속도 받는 생성자
    b_6_7_exam05_Car(float md1, String color, int maxSpeed) {
        this.md1 = md1;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
// 받는 매개변수 말고 입력되는 변수가 더 작은 범위일때 only 자동 형변환 된다!! 반대 경우는 컴파일 에러!


