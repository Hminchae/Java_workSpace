package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 2;
        b = ++a; // a 값을 먼저 증가시키고, 그 결과를 b에 대입

        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++;
        System.out.println("a = " + a + ", b = " + b);
    }
}


/*

💡 전위, 후위 증감연산자 :

✅++a :
증감 연산자를 피연산자 앞에 둘 수 있음
앞에 있다고 해서 전위(Prefix) 증감 연산자라고 함
증감 연산이 먼저 수행된 후 나머지 연산이 수행 됨

✅a++ :
증감 연산자를 피연산자 뒤에 둘 수 있음
이것을 뒤에 있다고 해서 후위(Postfix) 증감 연산자라고 함
다른 연산이 먼저 수행된 후 증감 연산이 수행됨

 */