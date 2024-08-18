package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        System.out.println(count +"개의 정수를 입력하세요: ");

        int[] numbers = new int[count];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("가장 작은 정수: " + Arrays.stream(numbers).min());
        System.out.println("가장 큰 정수: " + Arrays.stream(numbers).max());
    }
}
