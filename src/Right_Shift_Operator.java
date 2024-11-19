public class Right_Shift_Operator {
    public static void main(String[] args) {
        int x =150;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        // to shift right by 2 it meant 2^2. Decimal would be: x = x/4
        // Binary number will drop the far left bit.

        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();


         x =225;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;

        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

         x =1555;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;

        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

        x =32456;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;

        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();


    }
}
