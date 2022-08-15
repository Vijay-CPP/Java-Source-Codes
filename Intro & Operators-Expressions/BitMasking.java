//import java.lang.*;

class BitMasking {
    public static void main(String arg[]) {

        int a = 13; // 0000 1101
        int b = 8; // 0000 1000

        // to check if 4th bit is on or off

        int c = a & b;
        if (c > 0)
            System.out.println("Bit is ON");
        else
            System.out.println("Bit is OFF");

    }
}