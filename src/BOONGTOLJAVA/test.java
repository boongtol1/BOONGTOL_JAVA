package BOONGTOLJAVA;

public class test {

    // static 메서드
    
// 자바든 파이썬이든 클래스 내부는 동시에 인식돠는 특징이 있다!!!
    // main 메서드
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // static 메서드 호출
        staticMethod();

        System.out.println("Main method ended.");
    }
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
