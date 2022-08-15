
//import java.lang.*;
import java.util.Scanner;

class InputOutput {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("Enter a floating : ");
        float fl = sc.nextFloat();

        System.out.print("Enter a char : ");
        char ch = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        System.out.println(num + "  " + fl + "  " + ch + "  " + s);

        sc.close();
    }
}