public class Exercise10 {
    public static void main(String[] args) {
        //STORE ITEM PRICE AND QUANTITY, CALC SUBTOTAL,TAX AMOUNT AND FINAL BILL

        double itemPrice = 30.99;
        int quantity = 3;
        double taxRate = 0.08; 

        double subtotal = itemPrice * quantity;
        double taxAmount = subtotal * taxRate;
        double finalBill = subtotal + taxAmount;
        
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Final Bill: " + finalBill);
    }
    
}
