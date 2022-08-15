import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height : ");
        float height = sc.nextFloat();

        System.out.println("Enter the base : ");
        float base = sc.nextFloat();

        float area = 1.0f / 2 * base * height;
        // float area = (double)1/2 * base * height;

        System.out.println("Area = " + area);

        sc.close();
    }
}
