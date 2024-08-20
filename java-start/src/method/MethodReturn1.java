package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(5);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        boolean result;
        if (i % 2 == 1) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
