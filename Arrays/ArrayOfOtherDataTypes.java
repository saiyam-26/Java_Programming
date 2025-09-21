import java.util.Scanner;
public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of integers
        int[] intArray = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            intArray[i] = sc.nextInt();
        }

        // Array of doubles
        double[] doubleArray = new double[5];
        System.out.println("Enter 5 doubles:");
        for (int i = 0; i < 5; i++) {
            doubleArray[i] = sc.nextDouble();
        }

        // Array of strings
        String[] stringArray = new String[5];
        System.out.println("Enter 5 strings:");
        sc.nextLine();  // Consume the newline character
        for (int i = 0; i < 5; i++) {
            stringArray[i] = sc.nextLine();
        }

        // Displaying the arrays
        System.out.println("Integer Array:");
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("Double Array:");
        for (double d : doubleArray) {
            System.out.println(d);
        }

        System.out.println("String Array:");
        for (String s : stringArray) {
            System.out.println(s);
        }

        sc.close();
    }
}

    }
}    