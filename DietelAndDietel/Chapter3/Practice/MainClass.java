import java.util.*;

public class MainClass{
    public static void main(String args[]){
        Sandwich sw = new Sandwich();

        System.out.printf("Did you order any Sandwich yet sir:%s", sw.getSandwich());

        Scanner input = new Scanner(System.in);

        System.out.println("Which sandwich would you like to eat:");
        String order = input.nextLine();
        sw.setSandwich(order);

sw.deliverSandwich();

    }
}