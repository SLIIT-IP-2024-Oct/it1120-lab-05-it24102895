import java.util.Scanner;

 public class IT24102895Lab5Q2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members: ");
        int numberOfMembers = scanner.nextInt();

        if (numberOfMembers < 0){
            System.out.println("Invalid input!");
        }else{
            String prize;
            switch(numberOfMembers){
                case 0:
                prize = "No prize";
                break;

                case 1:
                prize = "Pen";
                break;

                case 2:
                prize = "Umbrella";
                break;

                case 3:
                prize = "Bag";
                break;

                case 4:
                prize = "Travelling Chair";
                break;

                default:
                prize = "Headphone";
                break;
            }
            System.out.println(" Prize is a " + prize);

        }
        
    }
 }