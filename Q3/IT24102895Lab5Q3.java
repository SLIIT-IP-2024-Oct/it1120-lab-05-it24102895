import java.util.Scanner;

public class IT24102895Lab5Q3 {
    public static void main(String[] args) {
        
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_10_PERCENT = 0.10;
        final double DISCOUNT_20_PERCENT = 0.20;

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Start Date: ");
        int startDate = scanner.nextInt();
        System.out.print("Enter End Date: ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31");
            return;
        }

        
        if (startDate >= endDate) {
            System.out.println("Error!");
            return;
        }

        
        int daysReserved = endDate - startDate;

        
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

        if (daysReserved >= 3 && daysReserved <= 4) {
            totalAmount -= totalAmount * DISCOUNT_10_PERCENT; 
        } else if (daysReserved >= 5) {
            totalAmount -= totalAmount * DISCOUNT_20_PERCENT; 
        }

        
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: Rs. " + totalAmount);

        
    }
}
 
