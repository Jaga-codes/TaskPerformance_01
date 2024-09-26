import java.util.Scanner;

class AmountDue {
    
    public double computeAmountDue(double price) {
        return price + (price * 0.12); 
    }

    public double computeAmountDue(double price, double quantity) {
        double total = price * quantity;
        return total + (total * 0.12); 
    }

    public double computeAmountDue(double price, double quantity, double discount) {
        double total = (price * quantity) - discount;
        return total + (total * 0.12); 
    }
}


public class RunAmountDue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price, quantity, and discount amount");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
             
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.println("Amount due is " + due.computeAmountDue(price));
                break;

            case 2:
                System.out.print("Enter price and quantity: ");
                price = scanner.nextDouble();
                double quantity = scanner.nextDouble();
                System.out.println("Amount due is " + due.computeAmountDue(price, quantity));
                break;

            case 3:
                System.out.print("Enter price, quantity, and discount: ");
                price = scanner.nextDouble();
                quantity = scanner.nextDouble();
                double discount = scanner.nextDouble();
                System.out.println("Amount due is " + due.computeAmountDue(price, quantity, discount));
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }

        scanner.close();
    }
}