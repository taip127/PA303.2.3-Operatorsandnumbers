public class postfix_increment {
    public static void main(String[] args) {
        int x =1;
        System.out.println("x is: "+x);


        int b = ++x;
        System.out.println("x after postfix increment: "+  x);
        System.out.println("b is: "+b);
        System.out.println();

        /*6.Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
        Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.*/
        int t =1;
        int k =10;
        int y =100;

        for(int i = 0;i<=2;i++){
            t +=1;
            ++k;
            y++;
            System.out.println("t is: "+t);
            System.out.println("k is: "+k);
            System.out.println("y is: "+y);
            System.out.println();
        }
        Sum_increment();
    }

    /*7.	Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
    Create another variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
    Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum, and then incremented x.*/
    public static void Sum_increment(){
        int x =5;
        int y =8;
        int sum = ++x + y;
        System.out.println("sum ++x is: "+sum);

        x=5; // reset x=5
        int sum2 = x++ + y;
        System.out.println("sum x++ is: "+sum2);
    }
}
