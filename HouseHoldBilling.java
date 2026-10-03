import java.util.*;
public class HouseHoldBilling {
     int calculateTotal(int morningUsage, int eveningUsage){
        
        return morningUsage + eveningUsage;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the morning water usage in litres:");
        int morningUsage = sc.nextInt();
        System.out.println("Enter the evening water usage in litres:");
        int eveningUsage = sc.nextInt();
        HouseHoldBilling billing = new HouseHoldBilling();
        int totalUsage = billing.calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total water usage is: " + totalUsage + " litres");
    }
}
