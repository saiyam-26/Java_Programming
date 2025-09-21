public class PassingArrayToMethods {
    public static void main(String[] args) {
        int x[] = {10, 31, 29, 38};

        System.out.println(x[2]);  // Line 1

        change(x);

        System.out.println(x[2]);  // Line 2
    }

    public static void change(int[] x) {
        x[2] = 99;
    }
}
