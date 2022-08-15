//import java.lang.*;

class IncrementDecrement {
    public static void main(String arg[]) {
        int x = 10;

        int y = x++; // y = 10 x = 11 use then update
        System.out.println(x + " " + y);

        y = ++x; // y = 12 x = 12 update then use
        System.out.println(x + " " + y);

    }
}