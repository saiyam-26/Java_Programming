import java.util.Scanner;

public class PointQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin");
        } else if (x == 0) {
            System.out.println("Point lies on the Y-axis");
        } else if (y == 0) {
            System.out.println("Point lies on the X-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Point lies in the 1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in the 2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in the 3rd Quadrant");
        } else {
            System.out.println("Point lies in the 4th Quadrant");
        }

        sc.close();
    }
}
