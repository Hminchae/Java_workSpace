package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5];

        System.out.println(students); // [I@7b23ec81 <- 주소값 [I <- int 형 배열, 뒷자리는 16진수 숫자
        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1) + "번의 점수: " + students[i]);
        }
    }
}

/*
int[] students = new int[5]; -> 1. 배열 생성
int[] students = x001; -> 2. new int[5] 의 결과로 x001 참조값 반환
students = x001 -> 3. 최종 결과
 */

/*
기본형 vs 참조형
자바의 변수 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류할 수 있음
- 사용하는 값을 직접 넣을 수 있는 기본형, 그리고 배열 변수와 같이 메모리의 참조값을 넣을 수 있는 참조형으로 분류할 수 있음
  - 기본형 : int, long, double, boolean 처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입을 기본형이라고 함
  - 참조형 : int[] students 와 같이 데이터에 접근하기 위한 참조를 저장하는 데이터 타입을 참조형이라 함.
           * 객체나 클래스를 담을 수 있는 변수들도 모두 참조형이다!
 */