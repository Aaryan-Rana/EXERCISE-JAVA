public class Exercise6 {
    public static void main(String[] args) {
        //SWAP TWO INTEGER VALUES USING A TEMPORARY VARIABLE
        int a = 5;
        int b = 10;
        int temp;
        System.out.println("Before swapping:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
    
}
