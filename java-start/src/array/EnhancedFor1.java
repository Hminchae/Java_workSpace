package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 일반 for 문
        for(int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for 문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each 문을 사용할 수 없는 경우, 증가하는 Index 값 필요

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}




/*
💡향상된 for 문
= 각각의 요소를 탐색한다는 의미로 for-each문이라고도 많이 부름
향상된 for 문은 배열을 사용할 때 기존 for 문 보다 더 편리하게 사용할 수 있음.

for (변수 : 배열 또는 컬렉션) {
    // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
}

--> iter 쓰면 됨 !!(단축키)
 */
