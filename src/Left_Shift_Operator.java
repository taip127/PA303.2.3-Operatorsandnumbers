public class Left_Shift_Operator {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal would be x*2 = 10
        //Binary would be = Binary + '0' to the right >> 10 become 100
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

        x = 9;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal would be x*2 = 18
        //Binary would be = Binary + '0' to the right >> 1001 become 10010
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

        x = 17;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal would be x*2 = 34
        //Binary would be = Binary + '0' to the right >> 10001 become 1000100
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

        x = 88;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // decimal would be x*2 = 176
        //Binary would be = Binary + '0' to the right >> 1011000 become 10110000
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println();





    }
}
