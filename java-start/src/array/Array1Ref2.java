package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        // int[] students; // 배열 변수 선언
        // students = new int[]{90, 80, 70, 60, 50}; //<- 요렇게 해도 됨! 배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50, 40, 40, 40, 40}; //<- 요렇게 해도 됨! 배열 생성과 초기화

        System.out.println(students);
        /*
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        */
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1) + "번의 점수: " + students[i]);
        }
    }
}