import java.util.Scanner;

public class IT24102895Lab5Q3 {
    public static void main(String[] args) {
        
        final double chargesPerDay = 48000.00;
        final double discount10 = 0.10;
        final double discount20 = 0.20;

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

        
        double totalAmount = daysReserved * chargesPerDay;

        if (daysReserved >= 3 && daysReserved <= 4) {
            totalAmount -= totalAmount * discount10; 
        } else if (daysReserved >= 5) {
            totalAmount -= totalAmount *discount20; 
        }

        
        System.out.println("Room Charge Per Day: Rs. " + chargesPerDay);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: Rs. " + totalAmount);

        
    }
}
 
