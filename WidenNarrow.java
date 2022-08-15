//import java.lang.*;

class WidenNarrow // Upcast Downcast
{
    public static void main(String arg[])
    {
        int i = 10;
        // byte b = 20;
        short s = 30;
        float f = 3.12f;
        // boolean bool = true;
        // double d = 123.123123;
        // long l = 123456789;

        // i = f; not allowed Narrow
        i = (int)f;
        System.out.println(i);

        i = s; // Widen
    }
}