import java.util.*;
public class HouseHold {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water consumed in litres:");
        double waterConsumed = sc.nextDouble();
        if(waterConsumed==500 || waterConsumed<500){
            System.out.println("The bill is $100");
        } else {
            System.out.println("The bill is $200");
        }
    }
    
}
