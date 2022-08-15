//import java.lang.*;
// import java.util.Scanner; 

class DataType {
    public static void main(String arg[]) {

        int a = 0, b = 0, c = 3;
        boolean isOk = true;
        double pi = 3.141598;
        float f = 121.21f;
        char ch = 'a';
        String s = "Vijay";

        System.out.println(a + b + c);
        System.out.println(isOk);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(s + f);

        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toOctalString(123));
        System.out.println(Integer.toHexString(123));
    }
}