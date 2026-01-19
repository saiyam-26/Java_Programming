import java.util.Scanner;

class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;

        System.out.println("The volume of the sphere with radius " + radius + " is " + volume);
    }
}
