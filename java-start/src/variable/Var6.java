package variable;

public class Var6 {

    public static void main(String[] args) {
        int a;
        //System.out.println(a); // ❌java: variable a might not have been initialized

        /* 💡

         왜 이런 오류가 발생할까?

         컴퓨터에서 메모리는 여러 시스템이 함께 사용하는 공간임
         그래서 어떠한 값들이 계속 저장된다.
         변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다.
         그런데 그 공간에 기존에 어떤 값이 있었는지는 아무도 모른다.
         따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있음
         이러한 문제를 예방하기 위해 자바는 변수를 초기화 하도록 강제함

         */

    }
}
