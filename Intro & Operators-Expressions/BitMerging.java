//import java.lang.*;

class BitMerging {
    public static void main(String arg[]) {
        int a = 5; // 0000 0101
        int b = 8; // 0000 1000

        a = a | b; // 0000 1101
        System.out.println(a);
    }
}