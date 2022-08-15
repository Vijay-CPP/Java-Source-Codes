
//import java.lang.*;
import java.util.Scanner;
import java.lang.Math;

class QuadraticRoots {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Enter a, b & c in ax^2 + bx + c = 0 : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        float discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are " + root1 + " & " + root2);

        } else {
            System.out.println("Roots are imaginary!");
        }

        sc.close();
    }
}