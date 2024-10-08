package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요. :");

        int sum = 0;
        int count = 0;

//        while (true) {
//            int inputInt = scanner.nextInt();
//
//            if (inputInt == -1) {
//                break;
//            }
//
//            sum += inputInt;
//            count++;
//        }
        int inputInt;

        while ((inputInt = scanner.nextInt()) != -1) {
                sum += inputInt;
                count++;
        }

        double avg = (double) sum / count; // 형변환 꼭!

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
