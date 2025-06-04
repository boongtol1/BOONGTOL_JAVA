package BOONGTOLJAVA.Test;
// 5. 구구단 중 n 단을 출력하는 메소드를 생성하고 사용자가 입력한 숫자의 구구단을 출력하는 코드를 작성하시오

import java.util.Scanner;

public class GugudanExample {
    // n단을 출력하는 메서드
    public static void printGugudan(int n) {
        System.out.println(n + "단");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("출력할 구구단 단수를 입력하세요: ");
        int input = sc.nextInt();
        
        printGugudan(input);
        
        sc.close();
    }
}

// 같은 클래스 내에서는 클래스명을 생략해 호출 가능.
// 다른 클래스의 static 메서드는 클래스명을 반드시 명시해야 호출 가능.