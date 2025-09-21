import java.util.Scanner;
public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

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
            stringArray[i] = sc.nextLine(); // use sc.nextline() for strings
        }

        
        sc.close();
    }
}

    }
}    