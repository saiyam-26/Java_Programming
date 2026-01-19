class OddDivisibleBy3 {
    public static void main(String[] args) {

        System.out.println("Odd numbers divisible by 3:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
