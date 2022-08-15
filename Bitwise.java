class Bitwise {
    public static void main(String arg[]) {
        int x = -10;
        int y = x >> 2; // diving x by 2^2
        int z = x << 1; // multiply x by 2^1
        int num = x >>> 1; // Unsigned right shift - Sign bit will also shift

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(num);

        int a = 10, b = 6;
        // Bitwise & |
        System.out.println(a & b);
        System.out.println(a | b);
    }
}