package cond.ex;

public class CondEx2 {

    public static void main(String[] args) {
        int distance = 800;
        String vihicle = "없음";

        if (distance <= 1) {
            vihicle = "도보";
        } else if (distance <= 10) {
            vihicle = "자전거";
        } else if (distance <= 100) {
            vihicle = "자동차";
        } else if (distance < 1000) {
            vihicle = "비행기";
        }
        System.out.println(vihicle + "를 이용하세요.");
    }
}
