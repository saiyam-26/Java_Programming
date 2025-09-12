import java.util.Scanner;
public class circleArea{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double pi = 3.1415;
        
        double area = pi * radius * radius;
        System.out.println("Area = " + area);
    }
}