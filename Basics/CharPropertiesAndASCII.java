class CharPropertiesAndASCII {
    public static void main(String[] args) {

        // Property 1: Type casting int to char and char to int
        int a = 65;
        char ch1 = (char) a;   // int to char
        System.out.println("int 65 casted to char: " + ch1);

        char ch2 = 'A';
        int b = ch2;          // char to int (implicit)
        System.out.println("char 'A' casted to int: " + b);

        // Property 2: char + 0 gives int
        char ch = 'B';
        int result1 = ch + 0;
        System.out.println("char 'B' + 0 = " + result1);

        // Property 3: char + char is possible but gives int
        char x = 'A';
        char y = 'C';
        int result2 = x + y;
        System.out.println("char 'A' + char 'C' = " + result2);

        // ASCII values of characters
        char c1 = 'A';
        char c2 = 'a';
        char c3 = '0';

        System.out.println("ASCII value of 'A' is: " + (int)c1); // 65
        System.out.println("ASCII value of 'a' is: " + (int)c2); // 97
        System.out.println("ASCII value of '0' is: " + (int)c3); // 48
    }
}
