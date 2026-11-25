public class Exercise7 {
    public static void main(String[] args) {
        //TYPE CONVERSION (WIDENING AND NARROWING) EXAMPLES

        int number = 10;
        double number2 = number; // Widening conversion
        System.out.println("Widening conversion: " + number2);

        double number3 = 10.5;
        int number4 = (int) number3; // Narrowing conversion
        System.out.println("Narrowing conversion: " + number4);
    }
    
}
