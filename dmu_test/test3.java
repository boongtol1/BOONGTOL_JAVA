package dmu_test;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        // 1~20 사이의 랜덤 숫자 생성
        Random rand = new Random();
        int targetNumber = rand.nextInt(20) + 1; // 1~20 범위의 숫자 생성
        int userGuess = 0;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 20까지의 숫자를 맞춰보세요!");

        // 사용자가 맞출 때까지 반복
        while (userGuess != targetNumber) {
            System.out.print("숫자를 입력하세요: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < targetNumber) {
                System.out.println("up");
            } else if (userGuess > targetNumber) {
                System.out.println("down");
            } else {
                System.out.println("bingo! " + attempts + "번 만에 맞췄습니다.");
            }
        }
        
        scanner.close();
    }
}
