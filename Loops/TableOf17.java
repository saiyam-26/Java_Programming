class class TableOf17 {
    public static void main(String[] args) {

        System.out.println("Method 1: Using i % 17 == 0");
        for (int i = 1; i <= 170; i++) {
            if (i % 17 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Method 2: Using i += 17");
        for (int i = 17; i <= 170; i += 17) {
            System.out.print(i + " ");
        }
    }
}
 
