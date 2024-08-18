package array.ex;

public class ArrayEx1 {

    public static void main(String[] args) {
        int[] studentsScore = {90, 80, 70, 60, 50};

        int totalScore = 0;

        for (int i : studentsScore) {
            totalScore += i;
        }

        double avg = (double) totalScore / studentsScore.length;

        System.out.println("점수 총합: " + totalScore);
        System.out.println("점수 평균: " + avg);
    }
}
