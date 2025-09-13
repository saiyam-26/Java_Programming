public class PositiveAP {
    public static void main(String[] args) {
        int a = 99;   // first term
        int d = -4;   // common difference

        for (; a > 0; a += d) {   // jab tak term positive hai
            System.out.print(a + " ");
        }
    }
}
