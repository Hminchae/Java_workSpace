package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요: ");
        int total = 0;
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            total += scanner.nextInt();
        }

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + (double)total / numbers.length);
    }
}
